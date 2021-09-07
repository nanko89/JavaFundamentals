import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int maxResult;
        char maxChar;
        String maxString;
        switch (type){
            case "int":

                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                maxResult = maxInteger(a,b);
                System.out.println(maxResult);
                break;
            case "char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                maxChar = maxOfChar(first,second);
                System.out.println(maxChar);

                break;
            case "string":
                String word1 = scanner.nextLine();
                String word2 = scanner.nextLine();
                maxString = maxStrings(word1,word2);
                System.out.println(maxString);

                break;
        }

    }

    private static String maxStrings(String word1, String word2) {
        int lengthWord1 = word1.length();
        int lengthWord2 = word2.length();
        if (lengthWord1 > lengthWord2){
            return word1;
        }
        return word2;
    }

    private static char maxOfChar(char first, char second) {
        return (char) (Math.max(first,second));
    }

    private static int maxInteger(int a, int b) {
        return Math.max(a,b);
    }


}
