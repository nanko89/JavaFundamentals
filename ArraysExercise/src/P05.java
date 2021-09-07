import java.util.Arrays;
import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();

        for (int index = 0; index < arr.length ; index++) {
            int current = arr[index];
            if (index == arr.length - 1){
                System.out.println(current);
                break;
            }
            boolean isBigger = false;
            for (int i = index + 1; i < arr.length  ; i++) {
                if (current > arr[i]){
                    isBigger = true;
                }else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(current + " ");
            }
        }
    }
}
