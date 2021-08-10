import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        List<Integer> numbers = new ArrayList<>();

        List<String> onlyChar = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if (currentChar >= 48 && currentChar <= 57){
                int currentDigit = Integer.parseInt(String.valueOf(currentChar));
                numbers.add(currentDigit);
            }else {
                onlyChar.add(String.valueOf(currentChar));
            }
        }
       StringBuilder newMessage = new StringBuilder();

        int currentIndex;
        int began = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0){
                currentIndex = numbers.get(i);
                for (int j = began; j < began + currentIndex ; j++) {
                    if (j < onlyChar.size()) {
                        newMessage.append(onlyChar.get(j));
                    }
                }
                began += currentIndex;
                if (began >= onlyChar.size()){
                    break;
                }
            }else {
                currentIndex = numbers.get(i);
                began += currentIndex;
                if (began >= onlyChar.size()){
                    break;
                }
            }
        }

        System.out.println(newMessage);

    }
}
