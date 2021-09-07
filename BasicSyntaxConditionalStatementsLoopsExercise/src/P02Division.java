import java.util.Scanner;

public class P02Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int biggerNum = 0;

        if(n % 2 == 0){
            biggerNum = 2;
        }
        if (n % 3 == 0){
            biggerNum = 3;
        }
        if (n % 6 == 0) {
            biggerNum = 6;
        }
        if (n % 7 == 0){
            biggerNum = 7;
        }
        if (n % 10 == 0){
            biggerNum = 10;
        }

        if (biggerNum != 0) {
            System.out.printf("The number is divisible by %d", biggerNum);
        }else {
            System.out.println("Not divisible");
        }

    }
}
