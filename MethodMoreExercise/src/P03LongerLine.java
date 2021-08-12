import java.util.Scanner;

public class P03LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstX1 = Double.parseDouble(scanner.nextLine());
        double firstY1 = Double.parseDouble(scanner.nextLine());
        double firstX2 = Double.parseDouble(scanner.nextLine());
        double firstY2 = Double.parseDouble(scanner.nextLine());

        double secondX1 = Double.parseDouble(scanner.nextLine());
        double secondY1 = Double.parseDouble(scanner.nextLine());
        double secondX2 = Double.parseDouble(scanner.nextLine());
        double secondY2 = Double.parseDouble(scanner.nextLine());

        double resultFirst = result(firstX1,firstX2,firstY1,firstY2);
        double resultSecond = result(secondX1,secondX2,secondY1,secondY2);

        if (resultFirst >= resultSecond){
            printResult(firstX1,firstX2,firstY1,firstY2);
        }else {
            printResult(secondX1,secondX2,secondY1,secondY2);
        }

    }

    private static void printResult(double x1, double x2, double y1, double y2) {

        double firstResult = Math.pow(x1,2) + Math.pow(y1,2);
        double secondResult = Math.pow(x2,2) + Math.pow(y2,2);

        if (firstResult <= secondResult){
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1,y1,x2,y2);
        }else {
            System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2,y2, x1,y1);
        }
    }


    private static double result(double firstX1, double firstX2, double firstY1, double firstY2) {
        double x = Math.abs(firstX1 - firstX2);
        double y = Math.abs(firstY1 - firstY2);
        return x + y;
    }
}
