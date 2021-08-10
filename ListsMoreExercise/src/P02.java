import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int halfIndex = numbers.size()/2;
        double firstResult = 0;
        double secondResult = 0;
        for (int i = 0; i < halfIndex ; i++) {
            firstResult = result(i,numbers,firstResult);
        }
        for (int i = numbers.size() - 1; i > halfIndex ; i--) {
           secondResult = result(i,numbers,secondResult);
        }
        if (firstResult < secondResult){
            System.out.printf("The winner is left with total time: %.1f", firstResult);
        }else {
            System.out.printf("The winner is right with total time: %.1f", secondResult);
        }
    }

    private static double result(int i, List<Integer> numbers, double result) {
        if (numbers.get(i) != 0){
            result += numbers.get(i);
        }else {
            result *= 0.8;
        }
        return result;
    }
}
