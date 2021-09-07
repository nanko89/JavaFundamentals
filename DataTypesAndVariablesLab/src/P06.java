import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       StringBuilder word = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char current = scanner.nextLine().charAt(0);
            word.append(current);
        }

        System.out.println(word);
    }
}
