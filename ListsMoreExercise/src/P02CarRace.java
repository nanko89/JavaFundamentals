import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> timeElement = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        double timeFirstPlayer = 0;
        double timeSecondPlayer = 0;
        for (int i = 0; i < timeElement.size()/2 ; i++) {
            int currentTime = timeElement.get(i);
            if (currentTime == 0){
                timeFirstPlayer = timeFirstPlayer * 0.80;
            }else {
                timeFirstPlayer += currentTime;
            }
        }
        for (int i = timeElement.size() - 1; i > timeElement.size()/2 ; i--) {
            int currentTime = timeElement.get(i);
            if (currentTime == 0){
                timeSecondPlayer = timeSecondPlayer * 0.80;
            }else {
                timeSecondPlayer += currentTime;
            }
        }
        if (timeFirstPlayer < timeSecondPlayer){
            System.out.printf("The winner is left with total time: %.1f", timeFirstPlayer);
        }else {
            System.out.printf("The winner is right with total time: %.1f", timeSecondPlayer);
        }
    }
}
