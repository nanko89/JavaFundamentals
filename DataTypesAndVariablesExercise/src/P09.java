import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int counterDays = 0;
        int totalSpice = 0;

        while (startingYield >= 100){
            counterDays ++;
            totalSpice += startingYield - 26;
            startingYield -= 10;
        }

        System.out.println(counterDays);
        if (totalSpice >= 26) {
            System.out.println(totalSpice - 26);
        }else {
            System.out.println(totalSpice);
        }
    }
}
