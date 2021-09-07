import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int": {
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                int result = intType(first, second);
                System.out.println(result);

                break;
            }
            case "char": {
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                char result = charType(first, second);
                System.out.println(result);

                break;
            }
            case "string":
            case "String": {
                String first = scanner.nextLine();
                String second = scanner.nextLine();
                String result = stringType(first, second);
                System.out.println(result);
                break;
            }
        }

    }

    private static String stringType(String first, String second) {

        if (first.compareTo(second)>= 0) {
            return first;
        }
        return second;

    }

    private static char charType(char first, char second) {
        return (char) Math.max(first,second);
    }

    private static int intType(int first, int second) {
        return Math.max(first,second);
    }


}
