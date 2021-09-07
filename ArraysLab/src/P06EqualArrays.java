import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstRow = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();
        int[] secondRow = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        boolean isIdentical = true;
        int sum = 0;
        int index =0;
        for (int i = 0; i < firstRow.length; i++) {
            if(firstRow[i] == secondRow[i]) {
                sum += firstRow[i];
            }else {
                isIdentical = false;
                index = i;
                break;

            }
        }
        if (isIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }

    }
}
