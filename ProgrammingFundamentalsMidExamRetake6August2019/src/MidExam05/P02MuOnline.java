package MidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> room = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        int bitcoins = 0;
        int health = 100;
        int bestRoom = 0;

        for (int i = 0; i < room.size(); i++) {
            bestRoom++;
            String[] currentRoom = room.get(i).split(" ");
            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);

            switch (command){
                case "potion":
                    int currentHealth = health;
                    health += number;
                    if (health > 100){
                        health = 100;
                    }
                    if (health < 100){
                    System.out.printf("You healed for %d hp.%n", number);
                    }else {
                        System.out.printf("You healed for %d hp.%n", 100 - currentHealth);
                    }
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                health -= number;
                if (health <= 0){
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", bestRoom);
                    return;
                }else {
                    System.out.printf("You slayed %s.%n", command);
                }

            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoins);
        System.out.printf("Health: %d", health);
    }
}
