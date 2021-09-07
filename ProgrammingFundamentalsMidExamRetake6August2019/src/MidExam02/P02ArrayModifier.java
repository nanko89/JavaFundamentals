package MidExam02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
        .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");
            String command = tokens[0];

            switch (command){
                case "swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);

                    int first = numbers.get(firstIndex);
                    int second = numbers.get(secondIndex);

                    numbers.set(firstIndex, second);
                    numbers.set(secondIndex, first);
                    break;
                case "multiply":
                    int firstMultiply = Integer.parseInt(tokens[1]);
                    int secondMultiply = Integer.parseInt(tokens[2]);
                    int result = numbers.get(firstMultiply) * numbers.get(secondMultiply);

                    numbers.set(firstMultiply,result);
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.size(); i++) {
                        numbers.set(i, numbers.get(i) - 1);
                    }
                    break;

            }

            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
