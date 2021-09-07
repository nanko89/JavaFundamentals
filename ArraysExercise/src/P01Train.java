import java.util.Arrays;
import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTrainWagons = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[countTrainWagons];
        int sum = 0;
        for (int i = 0; i < countTrainWagons; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println(sum);
    }
}
