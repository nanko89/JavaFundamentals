package MidExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> items = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("Craft!")){
            String[] token = input.split(" - ");
            String command = token[0];
            String currentItem = token[1];

            switch (command){
                case "Collect":
                    if (!items.contains(currentItem)){
                        items.add(currentItem);
                    }
                    break;
                case "Drop":
                    if (items.contains(currentItem)){
                        items.remove(currentItem);
                    }
                    break;
                case "Combine Items":
                    String[] currentToken = currentItem.split(":");
                    String oldItem = currentToken[0];
                    String newItem = currentToken[1];
                    if (items.contains(oldItem)){
                        items.add(items.indexOf(oldItem) + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (items.contains(currentItem)){
                        items.remove(currentItem);
                        items.add(currentItem);
                    }
                    break;

            }
            input = scanner.nextLine();

        }
        System.out.println(items.toString().replaceAll("[\\[\\]]",""));
    }
}
