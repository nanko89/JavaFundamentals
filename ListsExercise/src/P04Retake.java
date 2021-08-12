import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
        .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] token = input.split("\\s+");
            String command = token[0];
            if (command.equals("Add")){
                int number = Integer.parseInt(token[1]);
                numbers.add(number);
            }else if (command.equals("Insert")){
                int number = Integer.parseInt(token[1]);
                int index = Integer.parseInt(token[2]);
                if (isVlaidIndex(index,numbers.size())){
                    numbers.add(index,number);
                }else {
                    System.out.println("Invalid index");
                }
            }else if (command.equals("Remove")){
                int index = Integer.parseInt(token[1]);
                if (isVlaidIndex(index,numbers.size())){
                    numbers.remove(index);
                }else {
                    System.out.println("Invalid index");
                }
            }else if(command.equals("Shift")){
                String leftOrRight = token[1];
                int count = Integer.parseInt(token[2]);
                if (leftOrRight.equals("left")){
                    for (int i = 0; i < count; i++) {
                        int firstNum = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNum);
                    }
                }else {
                    for (int i = 0; i < count; i++) {
                        int lastNum = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNum);

                    }
                }
            }

            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean isVlaidIndex(int index, int size) {
        return index < size && index >= 0;
    }
}
