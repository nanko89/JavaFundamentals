import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")){
            String currentRow = input;
            String reversRow = reversRow(currentRow);
            System.out.println(currentRow.equals(reversRow));

            input = scanner.nextLine();

        }

    }

    private static String reversRow(String currentRow) {
        StringBuilder reverse = new StringBuilder();
        for (int i = currentRow.length() - 1; i >= 0 ; i--) {
            char currentChar = currentRow.charAt(i);
            reverse.append(currentChar);
        }
        return reverse.toString();
    }


}
