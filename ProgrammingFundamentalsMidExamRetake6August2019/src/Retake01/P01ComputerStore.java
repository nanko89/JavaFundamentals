package Retake01;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPriceWithoutTax = 0;
        double taxPerParts = 0;
        while (!(input.equals("special")|| input.equals("regular"))){
            double currentPricePerPart = Double.parseDouble(input);
            if (currentPricePerPart < 0){
                System.out.println("Invalid price!");
            }else {
                totalPriceWithoutTax += currentPricePerPart;
                taxPerParts += currentPricePerPart*0.2;
            }
            input = scanner.nextLine();
        }
        double totalPrice = totalPriceWithoutTax + taxPerParts;
        if (totalPrice == 0){
            System.out.println("Invalid order!");
        }else {
            if (input.equals("special")){
                totalPrice = totalPrice * 0.90;
            }
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n",totalPriceWithoutTax, taxPerParts,totalPrice);
        }
    }
}
