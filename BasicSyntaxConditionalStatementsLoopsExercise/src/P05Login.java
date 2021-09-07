import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();

        StringBuilder input1 = new StringBuilder();

        input1.append(userName);

        input1.reverse();
        String password = input1.toString();

        String input = scanner.nextLine();
        int counter = 0;

        while (!input.equals(password)){
            counter ++;
            if (counter >= 4){
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();

        }
        if (input.equals(password)){
            System.out.printf("User %s logged in.", userName);
        }
    }
}
