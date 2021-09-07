import java.util.Arrays;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] currentArrays = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

       int[] newArrays = currentArrays;

        while (newArrays.length > 1){
            newArrays = new int[newArrays.length - 1];
            for (int i = 0; i < newArrays.length ; i++) {
                newArrays[i] = currentArrays[i] + currentArrays[i + 1];
            }
            currentArrays = newArrays;
        }

        System.out.printf("%d", newArrays[0]);
    }
}
