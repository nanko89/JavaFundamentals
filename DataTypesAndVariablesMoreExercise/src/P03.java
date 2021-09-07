import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNum = Double.parseDouble(scanner.nextLine());
        double secondNum = Double.parseDouble(scanner.nextLine());

        double target = 0.000001;

        if (Math.abs(firstNum - secondNum) > target){
            System.out.println("False");
        }else {
            System.out.println("True");
        }

    }
}
