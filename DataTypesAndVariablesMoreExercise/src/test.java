import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double first = Double.parseDouble(scanner.nextLine());
        double second  =Double.parseDouble(scanner.nextLine());

        if (Math.abs(first - second) <= 0.000001){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
