import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

            int[] previousRow = new int[num];

        for (int indexRow = 1; indexRow <= num; indexRow++) {
            int[] currentArrays = new int[indexRow];
            currentArrays [0] = 1;
            if (currentArrays.length == 2) {
                currentArrays[1] = 1;
            }else {
            currentArrays[currentArrays.length - 1] = 1;

            }
            if (currentArrays.length > 2){
            for (int i = 1; i < indexRow - 1; i++) {
                currentArrays[i] = previousRow[i] + previousRow[i - 1];
            }

            }
            for (int currentArray : currentArrays) {
                    System.out.print(currentArray + " ");
            }
            System.out.println();
            previousRow = currentArrays;
        }
    }
}
