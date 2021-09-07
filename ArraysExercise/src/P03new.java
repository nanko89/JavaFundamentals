import java.util.Arrays;
import java.util.Scanner;

public class P03new {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstRow = new String[n];
        String[] secondRow = new String[n];

        for (int index = 0; index < n ; index++) {
            int[] currentArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (index % 2 == 1){
                secondRow [index] = String.valueOf(currentArr[0]);
                firstRow[index] = String.valueOf(currentArr[1]);
            }else {
                secondRow [index] = String.valueOf(currentArr[1]);
                firstRow [index] = String.valueOf(currentArr[0]);
            }
        }
        System.out.println(String.join(" ", firstRow));
        System.out.println(String.join(" ", secondRow));
    }
}
