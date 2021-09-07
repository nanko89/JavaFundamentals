package MidExam04;

import java.util.Arrays;
import java.util.Scanner;

public class P03HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] houses = Arrays.stream(scanner.nextLine().split("@")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();
        int currentIndex = 0;
        int countValentinesDayHouses = 0;

        while (!input.equals("Love!")){

            String[] command = input.split(" ");
            int jumpLength = Integer.parseInt(command[1]);
            currentIndex += jumpLength;

            if (currentIndex  >= houses.length){
                currentIndex = 0;
            }
                if (houses[currentIndex] != 0){
                    houses[currentIndex] -= 2;
                    if (houses[currentIndex] == 0){
                        System.out.printf("Place %d has Valentine's day.%n", currentIndex);
                        countValentinesDayHouses++;
                    }
                }else {
                    System.out.printf("Place %d already had Valentine's day.%n",currentIndex);
                }

            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentIndex);
        if (countValentinesDayHouses > houses.length - 1){
            System.out.println("Mission was successful.");
        }else {
            System.out.printf("Cupid has failed %d places.",houses.length - countValentinesDayHouses);
        }

    }
}
