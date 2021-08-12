import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startSymbol = scanner.nextLine().charAt(0);
        char finishSymbol = scanner.nextLine().charAt(0);
        if (startSymbol < finishSymbol) {
            StringBuilder result = resultOfChar(startSymbol, finishSymbol);
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        }else {
            StringBuilder result = resultOfChar(finishSymbol, startSymbol);
            result.deleteCharAt(result.length() - 1);
            System.out.println(result);
        }

    }

    private static StringBuilder resultOfChar(char startSymbol, char finishSymbol) {
        StringBuilder symbols = new StringBuilder();
        for (int symbol = startSymbol+1; symbol < finishSymbol ; symbol++) {
            char currentSymbol = (char) symbol;
            symbols.append(currentSymbol).append(" ");
        }
        return symbols;
    }
}
