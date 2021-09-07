package August2019;

import java.util.*;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String input = scanner.nextLine();

        List<String> stealItem = new ArrayList<>();
        while (!input.equals("Yohoho!")){
            String[] token = input.split(" ");
            String command = token[0];
            if (command.equals("Loot")){
                for (int i = 1; i < token.length ; i++) {
                    String currentItem = token[i];
                    if (!items.contains(currentItem)){
                        items.add(0,currentItem);
                    }
                }

            }else if (command.equals("Drop")){
                int index = Integer.parseInt(token[1]);
                if (index >= 0 && index < items.size()){
                    String currentItem = items.get(index);
                    items.add(currentItem);
                    items.remove(index);
                }
            }else if (command.equals("Steal")){
                int count = Integer.parseInt(token[1]);
                if (count > items.size()){
                    count = items.size();
                }
                for (int i = 0; i < count; i++) {
                    String currentElement = items.get(items.size() - 1);
                    stealItem.add(0, currentElement);
                    items.remove(items.size() - 1);
                }

                    System.out.println(stealItem.toString().replaceAll("[\\[\\]]", ""));
                    stealItem.clear();
            }
            input = scanner.nextLine();

        }

        double resultItem = 0;
        for (String item : items) {
            int currentLength = item.length();
            resultItem += currentLength;
        }
        if (items.isEmpty()){
            System.out.println("Failed treasure hunt.");
        }else {
            resultItem = resultItem / items.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", resultItem);
        }
    }
}
