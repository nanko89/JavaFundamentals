import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetTrashCounter = lostGame / 2;
        int mouseTrashCounter = lostGame / 3;
        int keyboardTrashCounter = lostGame / 6;
        int displayTrashCounter =lostGame / 12;

        double totalSum = headsetPrice * headsetTrashCounter + mousePrice * mouseTrashCounter +
                keyboardPrice * keyboardTrashCounter + displayPrice * displayTrashCounter;

        System.out.printf("Rage expenses: %.2f lv.", totalSum);
    }
}
