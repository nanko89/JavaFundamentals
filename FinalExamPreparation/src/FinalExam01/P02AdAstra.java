package FinalExam01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([#|])(?<itemName>[A-Za-z ]+)\\1(?<date>[0-9]{2}[/][0-9]{2}[/][0-9]{2})\\1(?<calories>[\\d]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int days =0;
        List<String> products = new ArrayList<>();
        while (matcher.find()){
            String name = matcher.group("itemName");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            if (calories < 10000) {
               days += calories;
               products.add(String.format("Item: %s, Best before: %s, Nutrition: %d", name,date,calories));

            }
        }
        System.out.printf("You have food to last you for: %d days!%n", days/2000);


               products.forEach(System.out::println);

        }

    }

