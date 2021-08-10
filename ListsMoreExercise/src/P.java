import java.util.Scanner;

public class P {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int searchDigit = Integer.parseInt(scanner.nextLine());

        int count = 0;

        while (number > 0){
            int leftOver = number % 2;
            if (leftOver == searchDigit){
                count ++;
            }
            number /= 2;
        }
        System.out.println(count);
    }
}
