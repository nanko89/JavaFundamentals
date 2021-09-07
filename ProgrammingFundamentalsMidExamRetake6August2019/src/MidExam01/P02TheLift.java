package MidExam01;

import java.util.Arrays;
import java.util.Scanner;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        int[] liftSeat = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int maxPeopleInWagon = 4;
        boolean freeSets = false;

        for (int i = 0; i < liftSeat.length; i++) {
            int currentWagon =maxPeopleInWagon - liftSeat[i];
            if (liftSeat[i] == 4){
                continue;
            }
            if (peopleInQueue < currentWagon){
                liftSeat[i] = peopleInQueue + liftSeat[i];
                freeSets = true;
                peopleInQueue = 0;

            }else if (peopleInQueue >= currentWagon){
            liftSeat[i] = currentWagon + liftSeat[i];
            peopleInQueue -= currentWagon;
            }
            if (peopleInQueue <= 0){
                break;
            }

        }
        if (peopleInQueue > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }else if (peopleInQueue == 0 && freeSets){
            System.out.println("The lift has empty spots!");
        }
        System.out.println(Arrays.toString(liftSeat).replaceAll("[\\[\\],]", ""));
    }
}
