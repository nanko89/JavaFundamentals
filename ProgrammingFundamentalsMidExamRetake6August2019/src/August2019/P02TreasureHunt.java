package August2019;

import java.util.*;
import java.util.stream.Collectors;

public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> names = Arrays.stream(scanner.nextLine()
                .split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        List<String> steel = new ArrayList<>();

        while (!input.equals("Yohoho!")){
            String[] command = input.split(" ");
            String currentCommand = command[0];

            switch (currentCommand){
                case "Loot":
                    for (int i = 1; i <command.length ; i++) {
                        boolean isHave = false;
                        String elements = command[i];
                        for (int index = 0; index < names.size(); index++) {
                            if (elements.equals(names.get(index))){
                                isHave = true;
                                break;
                            }
                        }
                        if (!isHave){
                            names.add(0,elements);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index >= 0 && index < names.size()){
                        String currentElement = names.get(index);
                        names.add(currentElement);
                        names.remove(index);
                    }
                    break;
                case "Steal":
                    int steelElement = Integer.parseInt(command[1]);
                    if (steelElement > names.size()){
                        steelElement = names.size();
                    }

                        for (int i = 0; i < steelElement; i++) {
                            String currentElement = names.get(names.size() - 1);
                            steel.add(0, currentElement);
                            names.remove(names.size() - 1);
                        }


                    System.out.println(steel.toString().replaceAll("[\\[\\]]", ""));
                    steel.clear();
                    break;
            }

            input = scanner.nextLine();
        }
        double sum = 0;
        int countElement = names.size();
        for (int i = 0; i < names.size(); i++) {
            String currentElement = names.get(i);
            int length = currentElement.length();
            sum += length;
        }

        if (names.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", sum/countElement);
        }
    }
}

