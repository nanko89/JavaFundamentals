import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newTime = hours * 60 + minutes + 30;

        int newHour = newTime / 60;
        if (newHour > 23){
            newHour = 0;
        }
        int newMinutes = newTime % 60;

        System.out.printf("%d:%02d", newHour, newMinutes);



    }
}
