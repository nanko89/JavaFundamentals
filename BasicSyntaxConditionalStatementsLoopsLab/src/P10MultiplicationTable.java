import java.util.Scanner;

public class P10MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int current;

        for (int i = 1; i <=10 ; i++) {
            current = n * i;
            System.out.printf("%d X %d = %d%n", n , i , current);
            
        }
    }
}
