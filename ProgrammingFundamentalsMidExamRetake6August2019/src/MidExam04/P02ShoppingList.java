package MidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")){

            String [] tokens = input.split(" ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command){
                case "Urgent":
                        if (!list.contains(item)){
                            list.add(0, item);
                        }
                    break;

                case "Unnecessary":
                    if (list.contains(item)){
                        list.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (list.contains(item)){
                        int index = list.indexOf(item);
                        list.set(index, newItem);
                    }
                    break;
                case "Rearrange":
                    if (list.contains(item)){
                        list.remove(item);
                        list.add(item);

                    }
                    break;
            }
            input = scanner.nextLine();

        }
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
    }
}
