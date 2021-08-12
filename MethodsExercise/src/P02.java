import java.util.Locale;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toLowerCase();

        int result = vowlesCount(word);
        System.out.println(result);


    }

    private static int vowlesCount(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
        char currentChar = word.charAt(i);
       switch (currentChar){
           case 'a':
           case 'e':
           case 'o':
           case 'i':
           case 'u':
               result++;
               break;

       }
        }
        return result;
    }
}
