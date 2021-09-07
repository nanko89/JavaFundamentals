import java.util.Scanner;

public class P02FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int countNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countNumber; i++) {
            double first = Double.parseDouble(scanner.next());
            double second = Double.parseDouble(scanner.next());

            int sum = 0;

            if (first > second) {
                double numFirst = Math.abs(first);
                while (numFirst > 0) {
                    sum += (numFirst % 10);
                    numFirst /= 10;
                }
            }else {
                double numSecond = Math.abs(second);
                while (numSecond > 0) {
                    sum += (numSecond % 10);
                    numSecond /= 10;
                }
            }
            System.out.println(Math.abs(sum));


        }

    }
}
