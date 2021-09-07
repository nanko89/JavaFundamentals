import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double currentPrice = 0;
        double totalPrice = 0;

        switch (typeOfGroup){
            case "Students":
                switch (dayOfWeek){
                    case "Friday":
                        currentPrice = 8.45;
                        break;
                    case "Saturday":
                        currentPrice = 9.80;
                        break;
                    case "Sunday":
                        currentPrice = 10.46;
                        break;
                }
                if (countGroup >= 30){
                    totalPrice = countGroup * currentPrice * 0.85;
                }else {
                    totalPrice = currentPrice * countGroup;
                }
                break;
            case "Business":
                switch (dayOfWeek){
                    case "Friday":
                        currentPrice = 10.90;
                        break;
                    case "Saturday":
                        currentPrice = 15.60;
                        break;
                    case "Sunday":
                        currentPrice = 16.00;
                        break;
                }
                if (countGroup >= 100){
                    totalPrice = (countGroup - 10) * currentPrice;
                }else {
                    totalPrice = countGroup * currentPrice;
                }
                break;
            case "Regular":
                switch (dayOfWeek){
                    case "Friday":
                        currentPrice = 15.00;
                        break;
                    case "Saturday":
                        currentPrice = 20.00;
                        break;
                    case "Sunday":
                        currentPrice = 22.50;
                        break;
                }
                if (countGroup >= 10 && countGroup <= 20){
                    totalPrice = currentPrice * countGroup * 0.95;
                }else {
                    totalPrice = currentPrice * countGroup;
                }
                break;
        }
        System.out.printf("%.2f", totalPrice);
    }
}
