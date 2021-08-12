import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command  = input.split(" ");
            String firstComman = command[0];

            switch (firstComman){
                case "Contains":
                    int number = Integer.parseInt(command[1]);
                    if (numbers.contains(number)){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }

                    break;
                case "Print":
                    String evenOrOdd = command[1];
                    if (evenOrOdd.equals("even")){
                        for (Integer integer : numbers) {
                            if (integer % 2 == 0) {
                                System.out.print(integer + " ");
                            }
                        }
                    }else {
                        for (Integer integer : numbers) {
                            if (integer % 2 == 1) {
                                System.out.print(integer + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer integer : numbers) {
                        sum += integer;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = command[1];
                    int currentNumber = Integer.parseInt(command[2]);
                    switch (condition){
                        case "<":
                            for (Integer integer : numbers) {
                                if (integer < currentNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            break;
                        case "<=":
                            for (Integer integer : numbers) {
                                if (integer <= currentNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            break;
                        case ">":
                            for (Integer integer : numbers) {
                                if (integer > currentNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            break;
                        case">=":
                            for (Integer integer : numbers) {
                                if (integer >= currentNumber) {
                                    System.out.print(integer + " ");
                                }
                            }
                            break;
                    }
                    System.out.println();
                    break;
            }

            input = scanner.nextLine();


        }


    }
}
