package MidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")){
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];
            switch (command){
                case "Collect":
                    if (!items.contains(item)){
                        items.add(item);
                    }
                    break;
                case "Drop":
                    if (items.contains(item)){
                        items.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] combineItem = item.split(":");
                    String oldItem = combineItem[0];
                    String newItem = combineItem[1];
                    if (items.contains(oldItem)){
                        int currentIndex = items.indexOf(oldItem);
                        items.add(currentIndex+1, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(item)){
                        items.remove(item);
                        items.add(item);
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        System.out.println(items.toString().replaceAll("[\\[\\]]", ""));
    }
}
