import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("End")){
            String[] command = input.split(" ");
            String firstWordCommand = command[0];


            switch (firstWordCommand){
                case "Add":
                    int addElement = Integer.parseInt(command[1]);
                    numbers.add(addElement);
                    break;
                case "Remove":
                    int removeElement = Integer.parseInt(command[1]);
                    if (removeElement > numbers.size() || removeElement < 0){
                        System.out.println("Invalid index");
                    }else {
                        numbers.remove(removeElement);
                    }
                    break;
                case "Insert":
                    int element = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index > numbers.size() || index < 0){
                        System.out.println("Invalid index");
                    }else {
                        numbers.add(index, element);
                    }
                    break;
                case "Shift":
                    String side = command[1];
                    int count = Integer.parseInt(command[2]);
                    switch (side){
                        case "left":
                            for (int i = 0; i < count ; i++) {
                              int firstIndex = numbers.get(0);
                              numbers.remove(0);
                              numbers.add(firstIndex);
                            }
                            break;
                        case "right":
                            for (int i = 0; i < count; i++) {
                                int lastIndex = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size()-1);
                                numbers.add(0,lastIndex);
                            }
                            break;
                    }
                    break;
            }

            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
