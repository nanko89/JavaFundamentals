import java.util.Scanner;

public class P05Login2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        StringBuilder passwordBilder = new StringBuilder();

        for (int position = username.length() - 1; position <= 0 ; position--) {
            char currentSymbol = username.charAt(position);
            passwordBilder.append(currentSymbol);
        }
        String password = passwordBilder.toString();
        String command = scanner.nextLine();

        int count = 0;
        while (!command.equals(password)){
            System.out.println("Incorrect password. Try again.");
            count ++;

            if (count >=4){
                System.out.printf("User %s blocked!", username);
                break;
            }
            command = scanner.nextLine();

        }
        if (command.equals(password)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
