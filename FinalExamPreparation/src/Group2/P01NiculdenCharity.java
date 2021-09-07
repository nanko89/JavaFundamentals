package Group2;

import java.util.Scanner;

public class P01NiculdenCharity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            String[] data = input.split(" ");
            String command = data[0];
            switch (command){
                case "Replace":
                    char currentChar = data[1].charAt(0);
                    char newChar = data[2].charAt(0);
                    text = new StringBuilder(text.toString().replace(currentChar,newChar));
                    System.out.println(text);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (startIndex > 0 && startIndex < text.length() &&
                            endIndex > 0 && endIndex < text.length()) {
                        text.delete(startIndex, endIndex + 1);
                        System.out.println(text);
                    }else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case "Make":
                    String upperOrLower = data[1];
                    if (upperOrLower.equals("Upper")){
                      text = new StringBuilder(text.toString().toUpperCase());
                        System.out.println(text);
                    }else {
                        text = new StringBuilder(text.toString().toLowerCase());
                        System.out.println(text);
                    }
                    break;
                case "Check":
                    String check = data[1];
                    if (text.toString().contains(check)){
                        System.out.println("Message contains " + check);
                    }else {
                        System.out.println("Message doesn't contains " + check);
                    }
                    break;
                case "Sum":
                    int sum = 0;
                    int startIndexSum = Integer.parseInt(data[1]);
                    int endIndexSum = Integer.parseInt(data[2]);
                    if (startIndexSum > 0 && startIndexSum < text.length() &&
                            endIndexSum > 0 && endIndexSum < text.length()) {
                        String substring = text.substring(startIndexSum, endIndexSum + 1);
                        for (int i = 0; i < substring.length(); i++) {
                            sum += substring.charAt(i);
                        }
                        System.out.println(sum);
                    }else {
                        System.out.println("Invalid index!");
                    }
                    break;
            }
        input = scanner.nextLine();

        }


    }
}
/*
IlikeSharan
Replace a e
Make Upper
Check SHEREN
Sum 1 4
Cut 1 4
Finish

HappyNameDay
Replace p r
Make Lower
Cut 2 23
Sum -2 2
Finish

 */
