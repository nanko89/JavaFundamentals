package FinalExam05;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")){
            String[] data = input.split(">>>");
            String command = data[0];
            switch (command){
                case "Contains":
                    break;
                case "Flip":
                    break;
                case "Slice":
                    break;
            }

            input = scanner.nextLine();

        }

    }
}
