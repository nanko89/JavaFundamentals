package FinalExam01;


import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        String command = scanner.nextLine();

        while (!"Decode".equals(command) ){
            String[] commandParts = command.split("\\|");
            String keyCommand = commandParts[0];

            switch (keyCommand) {
                case "Move":
                    int numOfLetters = Integer.parseInt(commandParts[1]);

                    stringBuilder.append(message, 0, numOfLetters);
                    message = message.substring(numOfLetters).concat(stringBuilder.toString());
                    stringBuilder.setLength(0);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[1]);
                    String value = commandParts[2];
                    stringBuilder.append(message);
                    message = stringBuilder.insert(index, value).toString();
                    stringBuilder.setLength(0);
                    break;
                case "ChangeAll":
                    String substring = commandParts[1];
                    String replacement = commandParts[2];
                    if (message.contains(substring)) {
                        message = message.replace(substring, replacement);
                    }
                    break;
                default:
                    break;
            }
            command = scanner.nextLine();

        }
        System.out.printf("The decrypted message is: %s", message);
    }
}
