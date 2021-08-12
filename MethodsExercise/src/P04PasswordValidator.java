import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isEnoughLongest = isEnoughLongest(password);
        boolean isOnlyLetterAndDigits = isOnlyLetterAndDigits(password);
        boolean isHaveTwoDigits = isHaveTwoDigits(password);

        if (!isEnoughLongest){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isOnlyLetterAndDigits){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isHaveTwoDigits){
            System.out.println("Password must have at least 2 digits");
        }
        if (isEnoughLongest && isHaveTwoDigits && isOnlyLetterAndDigits){
            System.out.println("Password is valid");
        }

    }

    private static boolean isHaveTwoDigits(String password) {
        boolean isTRue = false;
        int counter = 0;
        for (int i = 0; i <password.length() ; i++) {
            char currentChar = password.charAt(i);
            if (currentChar >= 48 && currentChar <= 57){
               counter ++;
            }
        }
        if (counter >= 2){
            isTRue = true;
        }
        return isTRue;
    }

    private static boolean isOnlyLetterAndDigits(String password) {

        boolean isTRue = false;
        for (int i = 0; i <password.length() ; i++) {
            char currentChar = password.charAt(i);
            if (currentChar >= 65 && currentChar <= 90 || currentChar >= 97 && currentChar <= 122 ||
            currentChar >= 48 && currentChar <= 57){
                isTRue = true;
            }else {
                isTRue = false;
                break;
            }
        }
        return isTRue;
    }

    private static boolean isEnoughLongest(String password) {
        boolean isTRue = false;
        if (password.length() >= 6 && password.length() <= 10){
            isTRue = true;
        }
        return isTRue;
    }
}
