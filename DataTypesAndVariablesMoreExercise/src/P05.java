import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key =  Integer.parseInt(scanner.nextLine());
        int countLines = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < countLines; i++) {
            char currentSymbol = scanner.nextLine().charAt(0);
            char realSymbol = (char) (currentSymbol + key);
            word.append(realSymbol);
        }
        System.out.println(word);
    }
}
