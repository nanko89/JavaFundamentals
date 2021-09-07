import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int finishNum = Integer.parseInt(scanner.nextLine());

        for (int i = startNum; i <= finishNum ; i++) {
            char currentSymbol = (char) i;
            System.out.print(currentSymbol + " ");
        }
    }
}
