import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
                String[] tokens = input.split(" ");
                String command = tokens[0];

                switch (command){
                    case "Add":
                        int addNumber = Integer.parseInt(tokens[1]);
                        numbers.add(addNumber);
                        break;
                    case "Remove":
                        int removeNumber = Integer.parseInt(tokens[1]);
                            numbers.remove(Integer.valueOf(removeNumber));
                        break;
                    case "RemoveAt":
                        int removeIndex = Integer.parseInt(tokens[1]);
                            numbers.remove(removeIndex);
                        break;
                    case "Insert":
                        int index = Integer.parseInt(tokens[2]);
                        int number = Integer.parseInt(tokens[1]);
                        numbers.add(index,number);
                        break;

                }

            input = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
