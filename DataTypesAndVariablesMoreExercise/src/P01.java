

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
        String type = "string";
        boolean isDoublePoint = false;
        int countPoint = 0;
        int integer = 0;
            if (input.length() == 1){
                char current = input.charAt(0);
                if (current >= 48 && current <= 57){
                    type = "integer";
                }else {
                    type = "character";
                }
            }else {
                for (int i = 0; i < input.length(); i++) {
                    char currentSymbol = input.charAt(i);
                    if (i == 0 && currentSymbol == 45 || (currentSymbol >= 48 && currentSymbol <= 57)|| currentSymbol ==46)
                        integer++;
                    if (currentSymbol == 46){
                        countPoint ++;
                        isDoublePoint = true;
                    }
                }
                if (integer == input.length()) {
                    if (countPoint == 1 && isDoublePoint) {
                        type = "floating point";
                    }else if (countPoint > 1){
                        type = "string";
                }else {
                        type = "integer";
                    }
                }
                String isBoolean = input.toLowerCase();
                switch (isBoolean){
                    case "true":
                    case "false":
                        type = "boolean";
                }

            }
            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();

        }
    }
}
