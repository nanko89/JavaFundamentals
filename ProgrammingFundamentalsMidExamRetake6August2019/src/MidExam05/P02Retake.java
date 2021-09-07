package MidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        int bitcoin = 0;
        List<String> rooms = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        for (int i = 0; i < rooms.size(); i++) {
            String[] currentRoom = rooms.get(i).split(" ");
            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);
            switch (command){

                case "chest":
                    bitcoin += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                case "potion":

                    int diffHealth = health;
                    health += number;
                    if (health > 100){
                        health = 100;
                        System.out.printf("You healed for %d hp.%n",100 - diffHealth);
                    }else {
                        System.out.printf("You healed for %d hp.%n",number);
                    }
                    System.out.printf("Current health: %d hp.%n",health);
                    break;
                default:
                health -= number;
                if (health > 0){
                    System.out.printf("You slayed %s.%n", command);
                }else {
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n",i + 1);
                    return;
                }
            }
        }
        System.out.println("You've made it!");
        System.out.printf("Bitcoins: %d%n", bitcoin);
        System.out.printf("Health: %d",health);
    }
}
