import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number ; i++) {
        String row = rowPrint(number);
            System.out.println(row);
        }
    }

    private static String rowPrint(int number) {
        StringBuilder row = new StringBuilder();
        for (int i = 0; i < number ; i++) {
            row.append(number).append(" ");
        }
        return row.toString();
    }
}
