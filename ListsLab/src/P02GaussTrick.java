import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());


        int halfSize = numbers.size()/2;
        for (int index = 0; index < halfSize; index++) {
            int sum = numbers.get(index) + numbers.get(numbers.size() - 1);
            numbers.set(index,sum);
            numbers.remove(numbers.size()-1);
        }
        for (Integer number: numbers) {
            System.out.print(number + " ");
        }
    }
}
