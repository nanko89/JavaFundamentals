package MidExam03;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startEnergy = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        int countWin = 0;
        while (!input.equals("End of battle")){
            int currentEnemyDistance = Integer.parseInt(input);
            if (startEnergy >= currentEnemyDistance){
                startEnergy -= currentEnemyDistance;
                countWin++;
                if (countWin % 3 == 0){
                    startEnergy += countWin;
                }
            }else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy",
                        countWin,startEnergy);
                return;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Won battles: %d. Energy left: %d", countWin,startEnergy);
    }
}
