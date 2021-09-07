import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printResult(number);


    }

    private static void printResult(int number) {
        if (number == 0){
            System.out.println("The number 0 is zero.");
        }else if (number > 0){
            System.out.printf("The number %d is positive.", number);
        }else {
            System.out.printf("The number %d is negative.", number);
        }
    }
}
