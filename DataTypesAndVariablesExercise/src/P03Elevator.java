import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double courses =numberOfPeople * 1.0 / capacityOfElevator;

        System.out.printf("%.0f",Math.ceil(courses));
    }
}
