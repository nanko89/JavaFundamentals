import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startSymbol = Integer.parseInt(scanner.nextLine());
        int finishSymbol = Integer.parseInt(scanner.nextLine());

        for (int i = startSymbol; i <=finishSymbol ; i++) {
            char currentSymbol = (char) i;
            System.out.print(currentSymbol + " ");
        }

    }
}
