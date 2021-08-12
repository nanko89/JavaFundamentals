import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandDate = command.split(" ");
            String commandName = commandDate[0];
            switch (commandName){
                case "Add":
                    int numberToAdd = Integer.parseInt(commandDate[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandDate[1]);
                    int index = Integer.parseInt(commandDate[2]);
                    if (isValidIndex(index,numbers.size())){
                        numbers.add(index,numberToInsert);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexRemoved = Integer.parseInt(commandDate[1]);
                    if (isValidIndex(indexRemoved, numbers.size())){
                        numbers.remove(indexRemoved);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String shiftType =  commandDate[1];
                    int count = Integer.parseInt(commandDate[2]);
                    if (shiftType.equals("left")){
                        shiftLeft(numbers, count);
                    }else if (shiftType.equals("right")){
                        shiftRight(numbers,count);
                    }
                    break;
            }

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int lastNum = numbers.get(numbers.size() - 1);
            numbers.add(0,lastNum);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            int firstNumber = numbers.get(0);
            numbers.add(firstNumber);
            numbers.remove(0);
        }
    }

    public static boolean isValidIndex(int index, int size){
        return index <= size && index >= 0;
    }
}
