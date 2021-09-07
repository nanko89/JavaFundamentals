import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int keyInterval = Integer.parseInt(scanner.nextLine());
        int countSymbol = Integer.parseInt(scanner.nextLine());
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < countSymbol; i++) {
            char currentChar = scanner.nextLine().charAt(0);
            char realChar = (char) (currentChar + keyInterval);
            word.append(realChar);
        }
        System.out.println(word);
    }
}
