package FinalExam04;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Done")){
            String currentCommand = command.split(" ")[0];

            switch (currentCommand){
                case "TakeOdd":
                    StringBuilder newWord = new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        char current = password.charAt(i);
                        if ( i % 2 == 1){
                            newWord.append(current);
                        }
                    }
                    System.out.println(newWord);
                    password = newWord;
                    break;
                case "Cut":
                    int index = Integer.parseInt(command.split(" ")[1]);
                    int length = Integer.parseInt(command.split(" ")[2]);

                    password.replace(index, index + length, "");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String oldString = command.split(" ")[1];
                    String newString = command.split(" ")[2];

                    if (password.toString().contains(oldString)){
                        password = new StringBuilder(password.toString().replaceAll(oldString,newString));
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }
            command = scanner.nextLine();

        }
        System.out.printf("Your password is: %s", password);
    }
}
