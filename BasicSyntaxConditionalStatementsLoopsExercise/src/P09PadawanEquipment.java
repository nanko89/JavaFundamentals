import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double pricePerLightsabers =Double.parseDouble(scanner.nextLine());
        double pricePerRobes= Double.parseDouble(scanner.nextLine());
        double pricePerBelts = Double.parseDouble(scanner.nextLine());

        double lightsabersPerStudent = Math.ceil(countStudents *1.1);

        double neededMoney = lightsabersPerStudent*pricePerLightsabers + countStudents*pricePerRobes + (countStudents - countStudents/6) *pricePerBelts;

        if (amountOfMoney >= neededMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", neededMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", neededMoney - amountOfMoney);
        }

    }
}
