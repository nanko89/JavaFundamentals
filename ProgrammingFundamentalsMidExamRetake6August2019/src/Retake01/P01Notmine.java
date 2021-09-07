package Retake01;

import java.util.Scanner;

public class P01Notmine {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String command = scanner.nextLine();

            double price = 0;
            while (!("special".equals(command) || "regular".equals(command))) {
                price = getPrice(command, price);
                command = scanner.nextLine();
            }
            if (price == 0) {
                System.out.println("Invalid order!");
                return;
            }
            double tax = price * 0.2;
            double totalPrice = price + tax;
            if (command.equals("special")) {
                totalPrice *= 0.9;
            }
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                            "Price without taxes: %.2f$%n" +
                            "Taxes: %.2f$%n" +
                            "-----------%n" +
                            "Total price: %.2f$%n"
                    , price, tax, totalPrice);
        }
        private static double getPrice(String command, double price) {
            double inputCash = Double.parseDouble(command);
            if (inputCash > 0) {
                price += inputCash;

            } else {
                System.out.println("Invalid price!");
            }
            return price;
        }
    }

