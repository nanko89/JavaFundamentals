import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> peopleInWagon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input =scanner.nextLine();
        while (!input.equals("end")){
            String[] token = input.split(" ");
            String command = token[0];
            if (command.equals("Add")){
                int people = Integer.parseInt(token[1]);
                peopleInWagon.add(people);
            }else {
                int people = Integer.parseInt(command);
                for (int i = 0; i < peopleInWagon.size(); i++) {
                    if (people + peopleInWagon.get(i) <= maxCapacity){
                        peopleInWagon.set(i,people + peopleInWagon.get(i));
                        break;
                    }
                }
            }

            input = scanner.nextLine();

        }
        System.out.println(peopleInWagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
