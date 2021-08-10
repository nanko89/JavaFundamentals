
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String text = scanner.nextLine();
        StringBuilder message = new StringBuilder();


        for (int i = 0; i < numbers.size(); i++) {
            int currentNum = numbers.get(i);
            int sumIndex = 0;
            while (currentNum > 0){
                int currentDigit = currentNum % 10;
                sumIndex+=currentDigit;
                currentNum /= 10;
            }
            if (sumIndex >= text.length() ){
                sumIndex = sumIndex - text.length();
            }
                char currentChar = text.charAt(sumIndex);
                message.append(currentChar);
                StringBuilder newWord = new StringBuilder(text);
                newWord.deleteCharAt(sumIndex);
                text = newWord.toString();

        }
        System.out.println(message);
    }
}
