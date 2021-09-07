
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLines; i++) {
            long firstNum = Long.parseLong(scanner.next());
            long secondNum = Long.parseLong(scanner.next());
            int sum = 0;

            long current = Math.abs(Math.max(firstNum, secondNum));
            while (current > 0){
            sum += (current % 10);
               current /= 10;
            }
            System.out.println(sum);
        }
    }
}
