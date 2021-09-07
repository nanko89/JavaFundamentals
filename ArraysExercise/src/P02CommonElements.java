import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstRow = scanner.nextLine().split(" ");
        String[] secondRow = scanner.nextLine().split(" ");
        for (String s : secondRow) {
            for (String value : firstRow) {
                if (value.equals(s)) {
                    System.out.print(s + " ");
                }
            }
        }



    }
}
