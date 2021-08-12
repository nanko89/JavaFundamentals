import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
       List<Integer> detonate = Arrays.stream(scanner.nextLine().split("\\s+"))
               .map(Integer::parseInt).collect(Collectors.toList());

        int bomb = detonate.get(0);
        int specialNum = detonate.get(1);

        while (numbers.contains(bomb)){

            int indexOfBomb = numbers.indexOf(bomb);
            int startIndex = Math.max(0, indexOfBomb - specialNum);
            int endIndex = Math.min(numbers.size() - 1, indexOfBomb + specialNum);

            if (endIndex >= startIndex) {
                numbers.subList(startIndex, endIndex + 1).clear();
            }
        }
        int sum = 0;
        for (Integer n : numbers) {
            sum += n;
        }
        System.out.println(sum);
    }
}
