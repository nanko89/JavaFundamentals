package FinalExam01;

import java.util.Scanner;

public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder word = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Decode")){
            String[] command = input.split("\\|");
            String commandName = command[0];

            switch (commandName){
                case "ChangeAll":
                    String newText = command[2];
                    String oldText = command[1];
                    word = new StringBuilder(word.toString().replace(oldText,newText));
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];
                    word.insert(index,value);
                    break;
                case "Move":
                    int move = Integer.parseInt(command[1]);
                    String moveLetter = word.substring(0,move);
                    word.replace(0,move,"");
                    word.append(moveLetter);
                    break;

            }


            input= scanner.nextLine();

        }
        System.out.println("The decrypted message is: " + word);
    }
}
