import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        while (firstPlayerCards.size() > 0 && secondPlayerCards.size() > 0){
            List<Integer> newFirstResult = new ArrayList<>();
            List<Integer> newSecondResult = new ArrayList<>();
            for (int i = 0; i < firstPlayerCards.size(); i++) {
                if (firstPlayerCards.get(i) > secondPlayerCards.get(i)){
                    newFirstResult.add(firstPlayerCards.get(i));
                    newFirstResult.add( secondPlayerCards.get(i));
                }else if (firstPlayerCards.get(i).equals(secondPlayerCards.get(i))){
                    continue;
                }else {
                    newSecondResult.add(secondPlayerCards.get(i));
                    newSecondResult.add( firstPlayerCards.get(i));
                }
            }
            if (firstPlayerCards.size() > secondPlayerCards.size()){
                for (int i = secondPlayerCards.size() ; i < firstPlayerCards.size(); i++) {
                    newFirstResult.add(firstPlayerCards.get(i));
                }
            }else if (secondPlayerCards.size() > firstPlayerCards.size()){
                for (int i = firstPlayerCards.size(); i < secondPlayerCards.size() ; i++) {
                    newSecondResult.add(secondPlayerCards.get(i));
                }
            }
            firstPlayerCards = newFirstResult;
            secondPlayerCards = newSecondResult;

        }
        int sum = 0;
        if (firstPlayerCards.size() == 0){
            for (Integer secondPlayerCard : secondPlayerCards) {
                sum += secondPlayerCard;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }else {
            for (Integer firstPlayerCard : firstPlayerCards) {
                sum += firstPlayerCard;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }


}
