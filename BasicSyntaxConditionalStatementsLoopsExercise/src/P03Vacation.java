import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String person = scanner.nextLine();
        String day = scanner.nextLine();

        double currentPrice = 0;
        double totalPrice = 0;
        if (person.equals("Students")){
            if (day.equals("Friday")){
                currentPrice =  8.45;
            }else if (day.equals("Saturday")){
                currentPrice = 9.80;
            }else if (day.equals("Sunday")){
                currentPrice = 10.46;
            }
            if (people >= 30){
                totalPrice = (people * currentPrice) * 0.85;
            }else {
                totalPrice = people * currentPrice;
            }

        }else if (person.equals("Business")){
            if (day.equals("Friday")){
                currentPrice =  10.90;
            }else if (day.equals("Saturday")){
                currentPrice = 15.60;
            }else if (day.equals("Sunday")){
                currentPrice = 16.00;
            }
            if (people >= 100){
                totalPrice = (people -10) * currentPrice;
            }else {
                totalPrice= people * currentPrice;
            }
        }else if (person.equals("Regular")){
            if (day.equals("Friday")){
                currentPrice =  15.00;
            }else if (day.equals("Saturday")){
                currentPrice = 20.00;
            }else if (day.equals("Sunday")){
                currentPrice = 22.50;
            }
            if (people >= 10 && people <= 20){
                totalPrice = (people * currentPrice) * 0.95;
            }else {
                totalPrice = people * currentPrice;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);

    }
}
