package FinalExam03;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Reveal")){
            String[] command = input.split(":\\|:");
            switch (command[0]){
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    message.insert(index," ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = command[1];
                    if (message.toString().contains(substring)){
                    message.replace(message.indexOf(substring), message.indexOf(substring) + substring.length(),"");
                    StringBuilder reverse = new StringBuilder(substring);
                    reverse.reverse();
                    message.append(reverse);
                        System.out.println(message);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String oldText = command[1];
                    String newText = command[2];

                        message = new StringBuilder(message.toString().replaceAll(oldText, newText));
                        System.out.println(message);

                    break;
            }

            input = scanner.nextLine();

        }
        System.out.printf("You have a new text message: %s", message);
    }
}
