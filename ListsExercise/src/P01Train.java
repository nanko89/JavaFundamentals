import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> passengersInEachWagon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityPerWagon = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")){
            String[] command = input.split(" ");
            String firstWord = command[0];
            int totalPassangers = 0;

            if (firstWord.equals("Add")){
                int passengers = Integer.parseInt(command[1]);
                passengersInEachWagon.add(passengers);
            }else {

                int addPassengers = Integer.parseInt(command[0]);
                for (int i = 0; i < passengersInEachWagon.size(); i++) {
                    if (passengersInEachWagon.get(i) + addPassengers <= maxCapacityPerWagon){
                        totalPassangers = passengersInEachWagon.get(i) + addPassengers;
                        passengersInEachWagon.set(i,totalPassangers);
                        break;
                    }

                }
            }
            input = scanner.nextLine();

        }
        System.out.println(passengersInEachWagon.toString().replaceAll("[\\[\\],]", ""));
    }
}
