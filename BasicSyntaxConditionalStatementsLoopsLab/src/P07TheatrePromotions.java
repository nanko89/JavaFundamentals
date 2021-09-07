import java.util.Scanner;

public class P07TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameDay = scanner.nextLine();
        int agePerson = Integer.parseInt(scanner.nextLine());

        int currentPrice;
        switch (nameDay) {
            case "Weekday":
                if (agePerson >= 0 && agePerson <= 18) {
                    currentPrice = 12;
                    System.out.println(currentPrice + "$");
                } else if (18 < agePerson && agePerson <= 64) {
                    currentPrice = 18;
                    System.out.println(currentPrice+ "$");
                } else if (64 < agePerson && agePerson <= 122) {
                    currentPrice = 12;
                    System.out.println(currentPrice+ "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Weekend":
                if (agePerson >= 0 && agePerson <= 18) {
                    currentPrice = 15;
                    System.out.println(currentPrice+ "$");
                } else if (18 < agePerson && agePerson <= 64) {
                    currentPrice = 20;
                    System.out.println(currentPrice+ "$");
                } else if (64 < agePerson && agePerson <= 122) {
                    currentPrice = 15;
                    System.out.println(currentPrice+ "$");
                } else {
                    System.out.println("Error!");
                }
                break;
            case "Holiday":
                if (agePerson >= 0 && agePerson <= 18) {
                    currentPrice = 5;
                    System.out.println(currentPrice+ "$");
                } else if (18 < agePerson && agePerson <= 64) {
                    currentPrice = 12;
                    System.out.println(currentPrice+ "$");
                } else if (64 < agePerson && agePerson <= 122) {
                    currentPrice = 10;
                    System.out.println(currentPrice+ "$");
                } else {
                    System.out.println("Error!");
                }
                break;
        }

    }
}
