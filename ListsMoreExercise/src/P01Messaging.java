import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String string = scanner.nextLine();

        int lengthString = string.length();
        StringBuilder message = new StringBuilder();

        for (int currentNum : numbers) {
            int sumDigit = 0;
            while (currentNum > 0) {
                int digit = currentNum % 10;
                sumDigit += digit;
                currentNum /= 10;
            }
            if (sumDigit >= lengthString) {
                sumDigit = sumDigit - lengthString;
            }
            for (int stringSymbol = 0; stringSymbol < string.length(); stringSymbol++) {
                if (sumDigit == stringSymbol) {
                    char currentChar = string.charAt(stringSymbol);
                    message.append(currentChar);
                    StringBuilder newString = new StringBuilder(string);
                    newString.deleteCharAt(stringSymbol);
                    string = newString.toString();
                }
            }
        }
        System.out.println(message);
    }
}
