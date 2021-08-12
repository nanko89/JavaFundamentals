import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] token = input.split(" ");
            String command = token[0];
            switch (command) {
                case "Contains":
                    int containsNum = Integer.parseInt(token[1]);
                    if (numbers.contains(containsNum)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String evenOrOdd = token[1];
                    if (evenOrOdd.equals("even")) {
                        List<Integer> evenNum = new ArrayList<>();
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                evenNum.add(number);
                            }
                        }
                        System.out.println(evenNum.toString().replaceAll("[\\[\\],]", ""));
                    } else {
                        List<Integer> oddNum = new ArrayList<>();
                        for (Integer number : numbers) {
                            if (number % 2 == 1) {
                                oddNum.add(number);
                            }
                        }
                        System.out.println(oddNum.toString().replaceAll("[\\[\\],]", ""));
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer num : numbers) {
                        sum += num;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = token[1];
                    int number = Integer.parseInt(token[2]);
                    List<Integer> filterList;

                    switch (condition) {
                        case "<":
                            filterList = numbers.stream().filter(e -> e < number).collect(Collectors.toList());
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case ">":
                            filterList = numbers.stream().filter(e -> e > number).collect(Collectors.toList());
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case "<=":
                            filterList = numbers.stream().filter(e -> e <= number).collect(Collectors.toList());
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                        case ">=":
                            filterList = numbers.stream().filter(e -> e >= number).collect(Collectors.toList());
                            System.out.println(filterList.toString().replaceAll("[\\[\\],]", ""));
                            break;
                    }
                        break;

            }
            input = scanner.nextLine();

        }
    }
}
