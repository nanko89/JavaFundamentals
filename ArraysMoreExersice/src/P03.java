import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        long firstNum = 0;
        long secondNum = 1;
        long thirdNum = firstNum + secondNum;

        for (int i = 0; i < n; i++) {
            firstNum = secondNum;
            secondNum = thirdNum;
            thirdNum = firstNum + secondNum;
        }
        System.out.println(firstNum);



    }
}
