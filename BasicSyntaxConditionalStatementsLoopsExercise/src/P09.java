import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers =Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double neededLightsbers = Math.ceil(countStudents*1.1);
        int freeBelts = countStudents / 6;


        double totalNeededMoney = countStudents * priceOfRobes + neededLightsbers * priceOfLightsabers + (countStudents-freeBelts)* priceOfBelts;

        if (totalNeededMoney > amountOfMoney){
            System.out.printf("Ivan Cho will need %. 2flv more", totalNeededMoney - amountOfMoney);
        }else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalNeededMoney);
        }

    }
}
