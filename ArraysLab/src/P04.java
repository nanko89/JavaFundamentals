import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] symbols = scanner.nextLine().split(" ");

        for (int i = 0; i < symbols.length/2; i++) {
            String temple = symbols[i];
            symbols[i] = symbols[symbols.length - i - 1];
            symbols[symbols.length - i - 1] = temple;

        }
        System.out.println(String.join(" ", symbols));
    }
}
