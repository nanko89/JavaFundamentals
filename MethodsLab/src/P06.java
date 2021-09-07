import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wight = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = getRecktangleArea(wight,length);

    }

    private static double getRecktangleArea(double wight, double length) {
        double rectangleArea = wight * length;
        return rectangleArea;

    }


}
