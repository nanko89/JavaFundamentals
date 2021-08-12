import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String command = scanner.nextLine();


        switch (input){
            case "int":
                printIntResult(command);
                break;
            case "real":
                printRealResult(command);
                break;
            case "string":
                printStringResult(command);
                break;
        }
    }


    private static void printIntResult(String command) {
        int currentNum = Integer.parseInt(command);
        int result = currentNum * 2;
        System.out.println(result);
    }

    private static void printRealResult(String command) {
        double currentNum = Double.parseDouble(command);
        double result = currentNum * 1.5;
        System.out.printf("%.2f" ,result);
    }

    private static void printStringResult(String command) {
        String result = "$" + command + "$";
        System.out.println(result);
    }

}
