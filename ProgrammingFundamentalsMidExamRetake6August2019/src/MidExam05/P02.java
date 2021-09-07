package MidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> dungeonsRooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i < dungeonsRooms.size(); i++) {
            String[] commandArray = dungeonsRooms.get(i).split(" ");
            if (commandArray[0].equals("potion")) {
                int numberForHealth = Integer.parseInt(commandArray[1]);
                int currentHealth = health;
                health = currentHealth + numberForHealth;
                if (health > 100) {
                    health = 100;
                }
                if (health < 100) {
                    System.out.printf("You healed for %d hp.%n", numberForHealth);
                    System.out.printf("Current health: %d hp%n.", health);
                } else if (health == 100) {
                    System.out.printf("You healed for %d hp.%n", 100 - currentHealth);
                    System.out.printf("Current health: %d hp%n.", health);
                }
            } else if (commandArray[0].equals("chest")) {
                int numberForBitcoins = Integer.parseInt(commandArray[1]);
                bitcoins = bitcoins + numberForBitcoins;
                System.out.printf("You found %d bitcoins.%n", numberForBitcoins);

            } else {
                String monster = commandArray[0];
                int attackOfMonster = Integer.parseInt(commandArray[1]);
                health = health - attackOfMonster;
                if (health > 0) {
                    System.out.printf("You slayed %s.%n", monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n", monster);
                    System.out.printf("Best room: %d%n", i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }

}
