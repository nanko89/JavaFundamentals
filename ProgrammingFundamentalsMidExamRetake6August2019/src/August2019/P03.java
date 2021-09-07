package August2019;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShipStatus = Arrays.stream(scanner.nextLine().split(">"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());

        String input =scanner.nextLine();
        while (!input.equals("Retire")){
            String[] token = input.split(" ");
            String command = token[0];
            switch (command){
                case "Fire":
                    int fireIndex = Integer.parseInt(token[1]);
                    int fireDamage = Integer.parseInt(token[2]);
                    boolean isValidFireIndex = isValidIndex(fireIndex,warShipStatus.size());
                    if (isValidFireIndex){
                        int fire = warShipStatus.get(fireIndex) - fireDamage;
                        if (fire > 0) {
                            warShipStatus.set(fireIndex, fire);
                        }else {
                            System.out.println("You won! The enemy ship has sunken.");
                            return;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(token[1]);
                    int endIndex = Integer.parseInt(token[2]);
                    int damage = Integer.parseInt(token[3]);
                    boolean startIndexValid = isValidIndex(startIndex,pirateShipStatus.size());
                    boolean endIndexValid = isValidIndex(endIndex, pirateShipStatus.size());
                    if (startIndexValid && endIndexValid){
                        for (int i = startIndex; i <=endIndex ; i++) {
                        int damageShip = pirateShipStatus.get(i) - damage;
                        if (damageShip > 0){
                            pirateShipStatus.set(i, damageShip);
                        }else {
                            System.out.println("You lost! The pirate ship has sunken.");
                            return;
                            }
                        }
                    }
                    break;
                case "Repair":
                    int repairIndex = Integer.parseInt(token[1]);
                    int health = Integer.parseInt(token[2]);
                    boolean isRepairIndexValid = isValidIndex(repairIndex,pirateShipStatus.size());
                    if (isRepairIndexValid){
                        int repair = pirateShipStatus.get(repairIndex) + health;
                        if (repair > maxHealth){
                            repair = maxHealth;
                        }
                        pirateShipStatus.set(repairIndex,repair);
                    }
                    break;
                case "Status":
                    //•	Status – prints the count of all sections of the pirate ship that need repair soon,
                    // which are all sections that are lower than 20% of the maximum health capacity.
                    // Print the following:
                    //"{count} sections need repair."
                    double lowerHealth = maxHealth*0.20;
                    int countSection = 0;
                    for (int i = 0; i < pirateShipStatus.size(); i++) {
                        if (pirateShipStatus.get(i) < lowerHealth){
                            countSection++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", countSection);
                    break;
            }

            input = scanner.nextLine();

        }
        int piratePoints = 0;
        int warhipPoints = 0;
        for (int i = 0; i < pirateShipStatus.size(); i++) {
            piratePoints += pirateShipStatus.get(i);
        }
        for (int i = 0; i < warShipStatus.size(); i++) {
            warhipPoints += warShipStatus.get(i);

        }
        System.out.printf("Pirate ship status: %d%n", piratePoints);
        System.out.printf("Warship status: %d", warhipPoints);
    }

    private static boolean isValidIndex(int index, int size) {
        return index>=0 && index < size;
    }
}
