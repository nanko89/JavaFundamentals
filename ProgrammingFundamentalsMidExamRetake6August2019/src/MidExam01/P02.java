package MidExam01;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleInQueue = Integer.parseInt(scanner.nextLine());
        String[] userInput = scanner.nextLine().split(" ");

        int[] liftCabins = Arrays.stream(userInput).mapToInt(Integer::parseInt).toArray();
//        List<Integer> liftCabinsList = Arrays.stream(userInput).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < liftCabins.length; i++) {
            //Влизат хора от опашката
            int peopleInCabin = liftCabins[i];
            int freeSpace = 4 - peopleInCabin;

            if(peopleInCabin == 4){
                continue;
            }

            if(freeSpace >= peopleInQueue){
                liftCabins[i] = liftCabins[i] + peopleInQueue;
                peopleInQueue = 0;
                //tUK
                break;
            }

            liftCabins[i] = 4;
            peopleInQueue = peopleInQueue - freeSpace;
        }

        boolean hasEmptySeats = false;
        for (int peopleInCabin : liftCabins) {
            if(peopleInCabin < 4){
                hasEmptySeats = true;
                break;
            }
        }


        if(hasEmptySeats){
            System.out.println("The lift has empty spots!");
        } else if (!hasEmptySeats && peopleInQueue!=0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleInQueue);
        }
        // нямаме свободни места, но и хората в опашката са свършили
        Arrays.stream(liftCabins).forEach(e -> System.out.print(e + " "));
    }
}
