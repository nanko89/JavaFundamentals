import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int totalSum = 0;
        int counter = 0;

        for (int i = 1; i < 100; i+=2) {
              if (i % 2 == 1){
                  totalSum += i;
                  counter++;
                  System.out.println(i);
              }
              if (counter == number){
                  break;
              }
        }

        System.out.println("Sum: " + totalSum);

    }
}
