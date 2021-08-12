import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            String firstCommand = command[0];
            int secondCommand = Integer.parseInt(command[1]);
            switch (firstCommand){
                case "Add":
                    numbers.add(secondCommand);
                    break;
                case "Remove":
                    numbers.remove(Integer.valueOf(secondCommand));
                    break;
                case "RemoveAt":
                    numbers.remove(secondCommand);
                    break;
                case "Insert":
                    int thirdCommand = Integer.parseInt(command[2]);
                    numbers.add(thirdCommand,secondCommand);
                    break;
            }
            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
