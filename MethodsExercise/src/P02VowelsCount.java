
import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toLowerCase();

        int vowels = vowelsCount(word);
        System.out.println(vowels);
    }

    private static int vowelsCount(String word) {
        int counter = 0;

        for (int i = 0; i <word.length() ; i++) {
            char symbol = word.charAt(i);
            switch (symbol) {
                case 'a':
                case 'o':
                case 'u':
                case 'i':
                case 'e':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
