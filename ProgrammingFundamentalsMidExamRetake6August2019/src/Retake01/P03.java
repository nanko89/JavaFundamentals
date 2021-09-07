package Retake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split(" "))
               .collect(Collectors.toList());
        int currentMoves = 0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }else {
            currentMoves ++;
                String[] tokens = input.split(" ");
                String firstNum = tokens[0];
                String secondNum = tokens[1];

                boolean isValidFirstIndex = isValidIndex(firstNum, numbers);
                boolean isValidSecondNum = isValidIndex(secondNum, numbers);

                if (isValidFirstIndex && isValidSecondNum && (!firstNum.equals(secondNum))){
                    String currentFirstNum = numbers.get(Integer.parseInt(firstNum));
                    String currentSecondNum = numbers.get(Integer.parseInt(secondNum));
                    if (currentFirstNum.equals(currentSecondNum)){
                        boolean isBigger = isBigger(firstNum,secondNum);
                        if (isBigger){
                        numbers.remove(Integer.parseInt(firstNum));
                        numbers.remove(Integer.parseInt(secondNum));
                        }else {
                            numbers.remove(Integer.parseInt(secondNum));
                            numbers.remove(Integer.parseInt(firstNum));
                        }

                        System.out.printf("Congrats! You have found matching elements - %s!%n", currentFirstNum);
                        if (numbers.isEmpty()){
                            System.out.printf("You have won in %d turns!", currentMoves);
                            break;
                        }
                    }else {
                        System.out.println("Try again!");
                    }

                }else {
                    System.out.println("Invalid input! Adding additional elements to the board");
                    int middleIndex = numbers.size()/2;
                    numbers.add(middleIndex,"-" + currentMoves + "a");
                    numbers.add(middleIndex, "-" + currentMoves + "a");
                }

            }
        }
        if (!numbers.isEmpty()){
            System.out.println("Sorry you lose :(");
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }

    private static boolean isBigger(String firstNum, String secondNum) {
        int first = Integer.parseInt(firstNum);
        int second = Integer.parseInt(secondNum);
        if (first > second){
            return true;
        }
        return false;
    }

    private static boolean isValidIndex(String number, List<String> numbers) {
        int currentNum = Integer.parseInt(number);
        return currentNum >= 0 && currentNum < numbers.size();
    }
}
