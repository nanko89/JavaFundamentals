package MidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")){
            String[] token = input.split(" ");
            String command = token[0];
            String item = token[1];

            switch (command){
                case "Urgent":
                    if (!shoppingList.contains(item)){
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = token[2];
                    if (shoppingList.contains(item)){
                        shoppingList.set(shoppingList.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)){
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;

            }
            input = scanner.nextLine();

        }
        System.out.println(shoppingList.toString().replaceAll("[\\[\\]]",""));
    }
}
