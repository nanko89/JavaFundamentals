import java.util.Arrays;
import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int counter = 1;
        int maxConter = 0;
        int maxSequence = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i+1]){
                counter ++;
            }else {
                counter = 1;
            }
            if (counter > maxConter){
                maxConter = counter;
                maxSequence = numbers[i];
            }
        }
        for (int i = 0; i < maxConter ; i++) {
            System.out.print(maxSequence + " ");
        }
    }
}
