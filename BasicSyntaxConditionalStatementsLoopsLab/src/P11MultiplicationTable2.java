import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int sum;

        for (int i = secondNum; i <=100 ; i++) {
            sum = firstNum * i;
            System.out.printf("%d X %d = %d%n", firstNum, i, sum);
            if (i >= 10){
                break;
            }
        }

    }
}
