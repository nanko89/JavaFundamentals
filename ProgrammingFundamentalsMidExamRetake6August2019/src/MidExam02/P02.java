package MidExam02;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                        mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] token = input.split(" ");
            String command = token[0];
            switch (command){
                case "swap":
                    int firstIndex = Integer.parseInt(token[1]);
                    int secondIndex = Integer.parseInt(token[2]);
                    int firstElement = numbers[firstIndex];
                    int secondElement = numbers[secondIndex];
                    numbers[firstIndex] = secondElement;
                    numbers[secondIndex] = firstElement;
                    break;
                case "multiply":
                    int index1 = Integer.parseInt(token[1]);
                    int index2 = Integer.parseInt(token[2]);
                    int currentNum = numbers[index1];
                    numbers[index1] = currentNum * numbers[index2];
                    break;
                case "decrease":

                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        System.out.println(Arrays.toString(numbers).replaceAll("[\\[\\]]", ""));
    }
}
