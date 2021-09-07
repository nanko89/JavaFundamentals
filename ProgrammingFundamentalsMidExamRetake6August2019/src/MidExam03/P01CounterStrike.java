package MidExam03;

import java.util.Scanner;

public class P01CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int counterBattel = 0;
        while (!input.equals("End of battle")){

            int currentDistance = Integer.parseInt(input);
            if (energy < currentDistance){
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",counterBattel, energy);
                return;
            }
            counterBattel ++;
            energy -= currentDistance;

            if (counterBattel % 3 == 0){
                energy += counterBattel;
            }
            input = scanner.nextLine();

        }

        System.out.printf("Won battles: %d. Energy left: %d",counterBattel, energy);
    }
    }
