import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            if (command.equals("Delete")){
                numbers.removeAll(Collections.singleton(element));

            }else {
                int position = Integer.parseInt(tokens[2]);
                numbers.add(position,element);
            }

            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

    }
}
