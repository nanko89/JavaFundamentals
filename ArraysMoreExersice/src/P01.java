
import java.util.Arrays;
import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNames = Integer.parseInt(scanner.nextLine());
        int[] result = new int[countNames];

        for (int i = 0; i < countNames; i++) {
            String currentName = scanner.nextLine();
             int sumSymbols = 0;

            for (int index = 0; index < currentName.length(); index++) {
                char currentChar = currentName.charAt(index);
                int currentLength = currentName.length();
                if (currentChar == 65
                        || currentChar == 69
                        || currentChar == 73
                        || currentChar == 79
                        || currentChar == 85
                        || currentChar == 97
                        || currentChar == 101
                        || currentChar == 105
                        || currentChar == 111
                        || currentChar == 117){
                    sumSymbols += currentChar * currentLength;
                }else {
                    sumSymbols += currentChar / currentLength;
                }
            }
        result[i] = sumSymbols;

        }
        Arrays.sort(result);
        for (int j : result) {
            System.out.println(j);

        }
    }
}
