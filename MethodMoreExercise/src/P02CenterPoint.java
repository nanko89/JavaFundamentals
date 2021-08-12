
import java.util.Scanner;

public class P02CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());

        double y1 = Double.parseDouble(scanner.nextLine());

        double x2 = Double.parseDouble(scanner.nextLine());

        double y2 = Double.parseDouble(scanner.nextLine());


        printResult(x1,x2,y1,y2);


    }

    private static void printResult(double x1, double x2, double y1, double y2) {
        double firstResult = Math.abs(x1) + Math.abs(y1);
        double secondResult = Math.abs(x2) + Math.abs(y2);


        if (firstResult == secondResult){
            System.out.printf("(%.0f, %.0f)", x1,y1);
        }else if (firstResult < secondResult){
            System.out.printf("(%.0f, %.0f)", x1,y1);
        }else {
            System.out.printf("(%.0f, %.0f)", x2,y2);
        }
    }
}
