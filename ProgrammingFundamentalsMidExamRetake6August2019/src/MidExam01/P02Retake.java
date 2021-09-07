package MidExam01;

import java.util.Arrays;
import java.util.Scanner;


public class P02Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleForLift = Integer.parseInt(scanner.nextLine());
        int[] wagonsLift = Arrays.stream(scanner.nextLine().split(" ")).
                        mapToInt(Integer::parseInt).toArray();
        int totalSpace = 4 * wagonsLift.length;
        int startPeople = peopleForLift;
        for (int i = 0; i < wagonsLift.length; i++) {
            totalSpace -= wagonsLift[i];
        }
        int maxPeople = 4;

        for (int i = 0; i < wagonsLift.length; i++) {
            int currentWagon = maxPeople - wagonsLift[i];
            if (peopleForLift >= currentWagon){
                peopleForLift -= currentWagon;
                wagonsLift[i] = maxPeople;
            }else if (peopleForLift < currentWagon){
                wagonsLift[i] = peopleForLift;
                peopleForLift -= currentWagon;
                break;
            }
            if (peopleForLift <= 0){
                break;
            }

        }
            if (startPeople > totalSpace) {
                System.out.printf("There isn't enough space! %d people in a queue!%n", peopleForLift);
            }else if (startPeople < totalSpace) {
                System.out.println("The lift has empty spots!");
            }

        System.out.println(Arrays.toString(wagonsLift).replaceAll("[\\[\\],]", ""));

    }
}
