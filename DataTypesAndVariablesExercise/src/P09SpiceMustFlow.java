import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int startingSpice = Integer.parseInt(scanner.nextLine());
         int workerConsumate = 26;
         int totalSpice = 0;
         int days = 0;

         while (startingSpice >= 100){
             days ++;
             int currentSpice = startingSpice - workerConsumate;
             totalSpice += currentSpice;

             startingSpice -= 10;
         }
        System.out.println(days);
         if (totalSpice > workerConsumate){
        System.out.println(totalSpice - workerConsumate);
         }else {
             System.out.println(totalSpice);
         }
    }
}
