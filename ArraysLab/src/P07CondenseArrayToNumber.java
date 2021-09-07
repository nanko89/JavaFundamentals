import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] newArray = array;

        while (newArray.length > 1) {
            newArray = new int[array.length - 1];
            for (int i = 0; i < array.length - 1; i++) {
                newArray[i] = array[i] + array[i + 1];
            }
                array = newArray;

        }

        System.out.printf("%d",newArray[0]);
    }
}

