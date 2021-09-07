import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        if (sorted.size() > 3) {
            for (int i = 0; i < 3; i++) {
                System.out.print(sorted.get(i));
                if (i < 2) {
                    System.out.print(" ");
                }
            }
        } else {
            for (int i = 0; i < sorted.size(); i++) {
                System.out.print(sorted.get(i));
                if (i < sorted.size() - 1) {
                    System.out.print(" ");
                }
            }
        }
    }
}
