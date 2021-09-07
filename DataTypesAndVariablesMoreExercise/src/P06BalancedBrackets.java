import java.util.Scanner;

public class P06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLine = Integer.parseInt(scanner.nextLine());

        boolean isBalanced = true;
        boolean isOpen = false;

        for (int i = 0; i < countLine; i++) {
        String input = scanner.nextLine();

                if (input.equals("(")) {
                    if (!isOpen) {
                        isOpen = true;
                    } else {
                        isBalanced = false;
                    }
                }

                if(input.equals(")")) {
                    if (isOpen) {
                        isOpen = false;
                    } else {
                        isBalanced = false;
                    }
                }
                }
                if (isBalanced && !isOpen){
                    isBalanced = true;
                }else {
                    isBalanced = false;
                }

        if(isBalanced){
         System.out.println("BALANCED");
        }else {
    System.out.println("UNBALANCED");
        }


    }
}
