import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int trashHeadset = lostGame / 2;
        int trashMouse = lostGame / 3;
        int trashKeyboard = lostGame / 6;
        int trashDisplay = lostGame / 12;

        double totalSum = trashHeadset*headsetPrice + trashMouse * mousePrice + trashKeyboard * keyboardPrice + trashDisplay * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);


    }
}
