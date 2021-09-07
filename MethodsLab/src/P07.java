import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        String repeated = repeatString(text,repeatTimes);
        System.out.println(repeated);

    }

    private static String repeatString(String text, int repeatTimes) {
        String result = "";
        for (int i = 0; i < repeatTimes; i++) {
            result += text;
        }
        return result;
    }
}
