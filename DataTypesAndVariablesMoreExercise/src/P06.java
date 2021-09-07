import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int countOpen = 0;
        int countClose = 0;
        int balanced = 0;
        for (int i = 0; i < numberOfLines; i++) {
            String input =scanner.nextLine();
            char currentSymbol = input.charAt(0);
            if (currentSymbol == 40){
                countOpen++;
                balanced ++;
                if (balanced > 1){
                    break;
                }
            }
            if (currentSymbol == 41){
                countClose++;
                if (balanced == 0){
                    break;
                }
                balanced--;
            }

            }
        if (countOpen - countClose != 0 || balanced > 1){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }
        }

    }

