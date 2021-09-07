import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int possition = userName.length()- 1; possition >=0 ; possition--) {
            char currentSymbol = userName.charAt(possition);
            password += currentSymbol;
        }
        String entirePassword = scanner.nextLine();
        int counter = 0;
        while (!entirePassword.equals(password)){
            counter ++;
            if (counter >=4){
                System.out.printf("User %s blocked!.", userName);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            entirePassword = scanner.nextLine();

        }

            System.out.printf("User %s logged in.", userName);

    }
}
