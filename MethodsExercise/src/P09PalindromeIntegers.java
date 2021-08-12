import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        while (!number.equals("END")) {
            String newNumber = newNumber(number);
            if (newNumber.equals(number)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

             number = scanner.nextLine();
        }

    }

        private static String newNumber (String number){
            StringBuilder newNumber = new StringBuilder();

            for (int i = number.length() - 1; i >= 0; i--) {
                char symbol = number.charAt(i);
                newNumber.append(symbol);

            }
            return newNumber.toString();
        }


}
