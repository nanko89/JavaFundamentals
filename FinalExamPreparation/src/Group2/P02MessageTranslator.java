package Group2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<command>[A-Z][a-z]{2,})!:\\[(?<message>[A-Za-z]{8,})]";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String message = scanner.nextLine();
            Matcher matcher = pattern.matcher(message);
            if (matcher.find()) {
                String currentMessage = matcher.group("message");
                String command = matcher.group("command");
                System.out.print(command + ": ");
                for (int j = 0; j < currentMessage.length() - 1; j++) {
                    System.out.print((int)currentMessage.charAt(j) + ", ");
                }
                System.out.println((int)currentMessage.charAt(currentMessage.length() - 1));
            }else{
                System.out.println("The invalid message");
            }


        }

    }
}
/*
2
!Sent!:[IvanisHere]
*Time@:[Itis5gykuf]
 */