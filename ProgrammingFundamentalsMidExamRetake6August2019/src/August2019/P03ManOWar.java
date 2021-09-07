package August2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Retire")){
            String[] command = input.split(" ");
            String currentCommand = command[0];

            switch (currentCommand){
                case "Fire":
                    int index = Integer.parseInt(command[1]);
                    int damageAttack = Integer.parseInt(command[2]);

                    if (index >= 0 && index < warShipStatus.size()){
                        int damageBrakes = warShipStatus.get(index) - damageAttack;
                        if(damageBrakes <= 0){
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                        warShipStatus.set(index, damageBrakes);
                    }
                    break;

                case "Defend":
                        int startIndex = Integer.parseInt(command[1]);
                        int endIndex = Integer.parseInt(command[2]);
                        int damageDefend = Integer.parseInt(command[3]);

                        if (startIndex >= 0 && startIndex <= pirateShipStatus.size()
                                && endIndex >=0 && endIndex <=pirateShipStatus.size()){
                            for (int i = startIndex; i <=endIndex ; i++) {
                                int damagePirateShip = pirateShipStatus.get(i) - damageDefend;
                                if (damagePirateShip <= 0){
                                    System.out.println("You lost! The pirate ship has sunken.");
                                    return;
                                }else {
                                    pirateShipStatus.set(i, damagePirateShip);
                                }
                            }
                        }
                    break;

                case "Repair":
                    int indexRepair = Integer.parseInt(command[1]);
                    int healthRepear = Integer.parseInt(command[2]);

                    if (indexRepair >= 0 && indexRepair < pirateShipStatus.size()){
                        int newHealth = pirateShipStatus.get(indexRepair) + healthRepear;
                        if (newHealth > maxHealth){
                            newHealth = maxHealth;
                        }
                        pirateShipStatus.set(indexRepair, newHealth);
                    }
                    break;

                case "Status":
                    double minStatusRepear = maxHealth * 0.20;
                    int count = 0;
                    for (int i = 0; i < pirateShipStatus.size(); i++) {
                        if (pirateShipStatus.get(i) < minStatusRepear){
                            count ++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", count);

                    break;
            }

            input = scanner.nextLine();

        }
        int pirateShipResult = 0;
        int warShipResult = 0;
        for (int i = 0; i < pirateShipStatus.size(); i++) {
            pirateShipResult += pirateShipStatus.get(i);
        }
        for (int i = 0; i < warShipStatus.size(); i++) {
            warShipResult += warShipStatus.get(i);
        }
        if (input.equals("Retire")){
            System.out.printf("Pirate ship status: %d%n",pirateShipResult);
            System.out.printf("Warship status: %d", warShipResult);
        }
    }
}
