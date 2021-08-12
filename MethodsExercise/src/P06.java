import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String result;
        if (word.length() % 2 == 0){
            result = findEvenWordMiddle(word);
        }else {
            result = findOddWordMiddle(word);
        }
        System.out.println(result);
    }

    private static String findOddWordMiddle(String word) {

        char currentChar = word.charAt(word.length()/2);
        return "" + currentChar;
    }

    private static String findEvenWordMiddle(String word) {
        char firstChar = word.charAt(word.length()/2 - 1);
        char secondChar = word.charAt(word.length()/2);
        return "" + firstChar + secondChar;
    }
}
