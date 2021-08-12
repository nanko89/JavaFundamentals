import java.util.Scanner;

public class P05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        boolean isHaveZero = false;

        if (firstNum < 0 || secondNum < 0 || thirdNum < 0){
            counter ++;
        }
        if (firstNum == 0 || secondNum == 0 || thirdNum == 0){
            isHaveZero = true;
        }
        if (isHaveZero){
            System.out.println("zero");
        }else if (counter % 2 == 1){
            System.out.println("negative");
        }else {
            System.out.println("positive");
        }
    }
}
