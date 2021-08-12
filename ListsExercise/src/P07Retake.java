import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        List<String> newList = new ArrayList<>();

        for (int i = numbers.size() - 1; i >= 0  ; i--) {
            List<String> currentNum = Arrays.stream(numbers.get(i).split("\\s+"))
                    .collect(Collectors.toList());
            for (int index = 0; index < currentNum.size(); index++) {
                if (!currentNum.get(index).equals("")) {
                    newList.add(currentNum.get(index));
                }
            }
        }
        System.out.println(newList.toString().trim().replaceAll("[\\[\\],]", ""));
    }
}
