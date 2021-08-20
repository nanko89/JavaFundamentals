package FinalExam05;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Integer> targetPopulation = new TreeMap<>();
        Map<String, Integer> targetGold = new TreeMap<>();
        while (!input.equals("Sail")){
            String[] data = input.split("\\|\\|");
            String target = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);
            targetGold.putIfAbsent(target,0);
            targetGold.put(target, targetGold.get(target) + gold);
            targetPopulation.putIfAbsent(target, 0);
            targetPopulation.put(target, targetPopulation.get(target) + population);

            input = scanner.nextLine();
        }

        String commandData = scanner.nextLine();
        while (!commandData.equals("End")){
            String[] data = commandData.split("=>");
            String command = data[0];

            switch (command){
                case "Plunder":

                    String town = data[1];
                    int people =Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);

                    targetGold.put(town, targetGold.get(town) - gold);
                    targetPopulation.put(town, targetPopulation.get(town) - people);
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, gold, people);
                    if (targetGold.get(town)==0 || targetPopulation.get(town)==0){
                        targetGold.remove(town);
                        targetPopulation.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;
                case "Prosper":
                    String townCity = data[1];
                    int golds = Integer.parseInt(data[2]);
                    if (golds < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        targetGold.put(townCity, targetGold.get(townCity) + golds);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                golds, townCity,targetGold.get(townCity));
                    }
                    break;


            }


            commandData = scanner.nextLine();

        }
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", targetGold.size());
        //Havana -> Population: 410000 citizens, Gold: 1100 kg
        targetGold.entrySet()
                .stream()
                .sorted((a,b) ->Integer.compare(b.getValue(),a.getValue()))
                .map(entry -> entry.getKey() + " -> Population: " + targetPopulation.get(entry.getKey())+" citizens, Gold: "+ entry.getValue()+ " kg")
                .forEach(System.out::println);
    }
}
