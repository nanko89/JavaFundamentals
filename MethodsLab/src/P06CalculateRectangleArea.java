import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wight = Integer.parseInt(scanner.nextLine());
        double length = Integer.parseInt(scanner.nextLine());
        double area = areaRectangle(wight, length);

        System.out.printf("%.0f", area);

    }

    private static double areaRectangle(double wight, double length) {
        return wight * length;

    }
}
