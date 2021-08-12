import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            String firstWord = command[0];
            int element = Integer.parseInt(command[1]);

            switch (firstWord){
                case "Delete":
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == element){
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;
                case "Insert":
                    int position = Integer.parseInt(command[2]);
                    numbers.add(position,element);
                    break;
            }


            input = scanner.nextLine();

        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
