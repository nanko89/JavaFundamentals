import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            String typeCommand = command[0];

            switch (typeCommand){
                case "exchange":
                    int exchangeIndex = Integer.parseInt(command[1]);
                    if (isValidIndex(exchangeIndex,numbers.length)){
                        numbers = exchange(numbers,exchangeIndex);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String evenOrOdd = command[1];
                    switch (evenOrOdd){
                        case "even":
                            printMaxEvenNumber(numbers);
                            break;
                        case "odd":
                            printMaxOddNumber(numbers);
                            break;
                    }
                    break;
                case "min":
                    String minEvenOrOdd = command[1];
                    switch (minEvenOrOdd){
                        case "even":
                            printMinEvenNumber(numbers);
                            break;
                        case "odd":
                            printMinOddNumber(numbers);
                            break;
                    }
                    break;
                case "first":
                    int count = Integer.parseInt(command[1]);
                    if (!isValidCount(count,numbers.length)){
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String firstEvenOrOdd = command[2];

                    switch (firstEvenOrOdd){
                        case "even":
                            printFirstEven(numbers,count);
                            break;
                        case "odd":
                            printFirstOdd(numbers,count);
                            break;
                    }
                    break;
                case "last":
                    int countElement = Integer.parseInt(command[1]);
                    if (!isValidCount(countElement,numbers.length)){
                        System.out.println("Invalid count");
                        input = scanner.nextLine();
                        continue;
                    }
                    String lastEvenOrOdd = command[2];
                    switch (lastEvenOrOdd){
                        case "even":
                            printLastEven(numbers,countElement);
                            break;
                        case "odd":
                            printLastOdd(numbers,countElement);
                            break;
                    }

                    break;
            }


            input = scanner.nextLine();

        }
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1){
                System.out.print(numbers[i]);
            }else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println("]");
    }

    private static boolean isValidCount(int count, int length) {
        return count <length ;
    }

    private static void printLastOdd(int[] numbers, int countElement) {
        String oddeven = "";

        for (int i = numbers.length - 1; i >=0 ; i--) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 1){
                oddeven += currentNum;
                countElement--;
            }
            if (countElement == 0){
                break;
            }
        }
        System.out.print("[");
        for (int index = oddeven.length() - 1; index >= 0 ; index--) {
            if (index == 0){
                System.out.print(oddeven.charAt(index));
            }else {
                System.out.print(oddeven.charAt(index) + ", ");
            }

        }
        System.out.println("]");
    }

    private static void printLastEven(int[] numbers, int countElement) {
        String lastEven = "";

        for (int i = numbers.length - 1; i >=0 ; i--) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0){
                lastEven += currentNum;
                countElement--;
            }
            if (countElement == 0){
                break;
            }
        }
        System.out.print("[");
        for (int index = lastEven.length() - 1; index >= 0 ; index--) {
            if (index == 0){
                System.out.print(lastEven.charAt(index));
            }else {
                System.out.print(lastEven.charAt(index) + ", ");
            }
            
        }
        System.out.println("]");
    }

    private static void printFirstOdd(int[] numbers, int count) {
        String output = "";

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 1){
                output += currentNumber;

                count--;

            }
            if (count == 0){
                break;
            }
        }

        System.out.print("[");
        for (int i = 0; i < output.length(); i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstEven(int[] numbers, int count) {
        String output = "";
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            if (currentNumber % 2 == 0){
                output += currentNumber;

                count--;

            }
            if (count == 0){
                break;
            }

        }
        System.out.print("[");
        for (int i = 0; i < output.length(); i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            } else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printMinOddNumber(int[] numbers) {
        int minOdd = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 1 && currentNum <= minOdd){
                minOdd = currentNum;
                minIndex = i;
            }
        }
        if (minIndex == -1){
            System.out.println("No matches");
        }else {
            System.out.println(minIndex);
        }

    }

    private static void printMinEvenNumber(int[] numbers) {
        int minEven = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            if (currentNum % 2 == 0 && currentNum <=minEven){
                minEven = currentNum;
                minIndex = i;
            }
        }
        if (minIndex == -1){
            System.out.println("No matches");
        }else {
            System.out.println(minIndex);
        }

    }

    private static void printMaxOddNumber(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
            int currentNum = numbers[index];
            if (currentNum % 2 == 1 && currentNum >= maxOdd){
                maxOdd = currentNum;
                maxIndex = index;
            }

        }
        if (maxIndex == -1){
            System.out.println("No matches");
        }else {
            System.out.println(maxIndex);
        }
    }

    private static void printMaxEvenNumber(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
            int currentNum = numbers[index];
            if (currentNum % 2 == 0 && currentNum >= maxEven){
                maxEven = currentNum;
                maxIndex = index;
            }

        }
        if (maxIndex == -1){
            System.out.println("No matches");
        }else {
            System.out.println(maxIndex);
        }
    }

    private static int[] exchange(int[] numbers, int exchangeIndex) {
        int[] numbersToExchangeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterExchangeIndex = new int[numbers.length - exchangeIndex - 1];

        for (int index = 0; index <= exchangeIndex; index++) {
            int currentElement = numbers[index];
            numbersToExchangeIndex[index] = currentElement;
        }
        for (int index = exchangeIndex + 1; index < numbers.length ; index++) {
            int currentElement = numbers[index];
            numbersAfterExchangeIndex[index - exchangeIndex - 1] = currentElement;
        }
        int[] exchangeArray = new int[numbers.length];
        for (int i = 0; i < numbersAfterExchangeIndex.length; i++) {
        exchangeArray[i] = numbersAfterExchangeIndex[i];
        }
        for (int i = numbersAfterExchangeIndex.length; i <= exchangeArray.length - 1; i++) {
            exchangeArray[i] = numbersToExchangeIndex[i - numbersAfterExchangeIndex.length];
        }
        return exchangeArray;
    }

    private static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }
}
