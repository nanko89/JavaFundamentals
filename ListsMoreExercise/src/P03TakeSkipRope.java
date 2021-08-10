import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hiddenMessage = scanner.nextLine();
        StringBuilder readMessage = new StringBuilder(hiddenMessage);
        StringBuilder text = new StringBuilder();
        StringBuilder numberList = new StringBuilder();
        for (int i = 0; i < readMessage.length(); i++) {
            char currentChar = readMessage.charAt(i);
            if (currentChar >=48 && currentChar <= 57){
                numberList.append(currentChar).append(" ");
            }else {
                text.append(currentChar);
            }
        }

        List<Integer> number = Arrays.stream(numberList.toString().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i <number.size() ; i++) {
            if (i % 2 == 0){
                takeList.add(number.get(i));
            }else {
                skipList.add(number.get(i));
            }
        }
        StringBuilder message = new StringBuilder();
        int currentIndex = 0;
        boolean breakLoop = false;
        while (!breakLoop){
            for (int i = 0; i < takeList.size() ; i++) {
                  int currentTakeDigit = takeList.get(i);
                  int currentSkipDigit = skipList.get(i);
                for (int take = currentIndex; take < currentIndex + currentTakeDigit ; take++) {
                    if (take < text.length()) {
                        message.append(text.charAt(take));
                    }
                }
                currentIndex += currentTakeDigit;
                currentIndex += currentSkipDigit;
                if (i == takeList.size() - 1 || currentIndex > text.length() - 1 ){
                    breakLoop = true;
                    break;
                }
            }
        }
        System.out.println(message);
    }
}
