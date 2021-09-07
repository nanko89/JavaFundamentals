import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "\\|(?<boss>[A-Z]{4,})\\|:#(?<title>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()){
                String name = matcher.group("boss");
                String title = matcher.group("title");

                System.out.println(name +", The " + title);
                System.out.printf(">> Strength: %d%n", name.length());
                System.out.printf(">> Armor: %d%n",title.length());
            }else {
                System.out.println("Access denied!");
            }
        }

    }
}
