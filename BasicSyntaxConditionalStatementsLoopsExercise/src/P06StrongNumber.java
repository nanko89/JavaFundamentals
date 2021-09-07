import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int sum = 0;

        while (number != 0){
            int digit = number % 10;
            int fact = 1;
            for (int i = 1; i <=digit ; i++) {
                fact = fact * i;
            }
            sum += fact;
            number /= 10;

             }
        if (sum == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        }
    }



