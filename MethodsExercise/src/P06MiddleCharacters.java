import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String symbol;
        if (word.length() % 2 == 0){
            symbol = evenSymbol(word);
        }else {
            symbol = oddSymbol(word);
        }
        System.out.println(symbol);
    }

    private static String evenSymbol(String word) {
        StringBuilder symbol = new StringBuilder();
        for (int i = word.length()/2 -1; i <= word.length()/2  ; i++) {
        char newSymbol = word.charAt(i);
        symbol.append(newSymbol);
        }

        return symbol.toString();
    }

    private static String oddSymbol(String word) {
        StringBuilder symbol = new StringBuilder();
        char newSymbol = word.charAt(word.length()/2);
        symbol.append(newSymbol);
        return symbol.toString();
    }
}
