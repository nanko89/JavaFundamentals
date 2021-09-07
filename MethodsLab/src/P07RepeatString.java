import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

       String repeat =  repeatString(text,repeatTimes);
        System.out.println(repeat);
    }

    private static String repeatString(String text, int repeatTimes) {
        StringBuilder newText = new StringBuilder();
        for (int i = 0; i < repeatTimes; i++) {
            newText.append(text);
        }
        return newText.toString();
    }
}
