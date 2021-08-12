import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char finishSymbol = scanner.nextLine().charAt(0);
        String allSymbols;
        if (startSymbol < finishSymbol){
            allSymbols = symbolsBetween(startSymbol, finishSymbol);
        }else {
            allSymbols = symbolsBetween(finishSymbol, startSymbol);
        }
        System.out.println(allSymbols);

    }

    private static String symbolsBetween(char startSymbol, char finishSymbol) {
        StringBuilder allSymbol = new StringBuilder();
        for (int i = startSymbol + 1; i <finishSymbol ; i++) {
            char newChar = (char) i;
            allSymbol.append(newChar).append(" ");
        }
        return allSymbol.toString();
    }
}
