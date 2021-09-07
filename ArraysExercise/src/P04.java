import java.util.Arrays;
import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation ; rotation++) {
            int firstNum = arr[0];
            for (int index = 0; index <arr.length - 1 ; index++) {
                arr[index] = arr[index + 1];
            }
            arr[arr.length - 1] = firstNum;
        }
        for (int number: arr) {
            System.out.print(number + " ");

        }
    }
}
