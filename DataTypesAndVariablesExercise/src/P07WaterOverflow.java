import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//The input will be on two lines:
//•	On the first line, you will receive n – the number of lines, which will follow
//•	On the next n lines – you receive quantities of water, which you have to pour in the tank
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int tankCapacity = 255;

        for (int i = 0; i < numberOfLines; i++) {
        int liters = Integer.parseInt(scanner.nextLine());
        if (tankCapacity >= liters) {
            tankCapacity -= liters;
        }else {
            System.out.println("Insufficient capacity!");
        }

        }
        System.out.println(255 - tankCapacity);


    }
}
