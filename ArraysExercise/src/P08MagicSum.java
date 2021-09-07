import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e->Integer.parseInt(e)).toArray();
        int sum = Integer.parseInt(scanner.nextLine());
        for (int first = 0; first <= numbers.length; first++) {

            for (int second = first+1; second <numbers.length; second++) {

                if (numbers[first] + numbers[second] == sum){
                    System.out.println(numbers[first] + " "+ numbers[second]);
                }

            }
        }

    }
}
