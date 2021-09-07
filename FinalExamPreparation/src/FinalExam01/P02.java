package FinalExam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String regex = "([#|])(?<product>[A-Za-z ]+)\\1(?<date>[0-9]{2}[/][0-9]{2}[/][0-9]{2})\\1(?<count>[\\d]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> products = new ArrayList<>();
        int days = 0;

        while (matcher.find()){
            String current;
        String product = matcher.group("product");
        String date = matcher.group("date");
        int calories = Integer.parseInt(matcher.group("count"));
        if (calories < 10000){
            days += calories;
            current = String.format("Item: %s, Best before: %s, Nutrition: %d", product, date, calories);
            products.add(current);
        }
        }
        System.out.printf("You have food to last you for: %d days!%n", days/2000);
        products.forEach(System.out::println);

    }
}
