import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int halfLength = numbers.size()/2;


        for (int i = 0; i < halfLength; i++) {
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.set(i,sum);
            numbers.remove(numbers.size() - 1);



        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
