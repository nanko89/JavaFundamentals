import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine().toLowerCase();
        boolean isEnoughLong = isEnoughLong(password);
        boolean isHaveLetterAndDigits = isHaveLetterAndDigits(password);
        boolean isHaveTwoDigit = isHaveTwoDigit(password);

        if (isEnoughLong && isHaveTwoDigit && isHaveLetterAndDigits){
            System.out.println("Password is valid");
        }

    }




    private static boolean isEnoughLong(String password) {
        boolean result = false;
        if (password.length() >= 6 && password.length() <= 10){
            result = true;
        }else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return result;
    }
    private static boolean isHaveLetterAndDigits(String password) {
        boolean isDigit = false;
        boolean isLetter = false;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (currentChar >= 48 && currentChar <=57){
                isDigit = true;
            }else if (currentChar >= 97 && currentChar <= 122){
                isLetter = true;
            }else {
                System.out.println("Password must consist only of letters and digits");
                isDigit = false;
                isLetter = false;
                break;
            }
        }
        return isDigit && isLetter;
    }
    private static boolean isHaveTwoDigit(String password) {

        int digits = 0;

        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);

            if (currentChar >= 48 && currentChar <=57){
                digits ++;
            }
        }
        if (digits < 2){
            System.out.println("Password must have at least 2 digits");
        } else{
            return true;
        }
        return false;
    }
}
