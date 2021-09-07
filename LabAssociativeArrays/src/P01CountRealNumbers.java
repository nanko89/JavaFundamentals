import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input =scanner.nextLine().split(" ");
        double[] nums = Arrays.stream(input).mapToDouble(Double::parseDouble).toArray();
        Map<Double,Integer> numbers = new TreeMap<>();
        for (double number : nums) {
            if (!numbers.containsKey(number)){
                numbers.put(number,1);
            }else {
                int occurrences = numbers.get(number);
                occurrences ++;
                numbers.put(number,occurrences);
            }

        }
        for (Map.Entry<Double,Integer> entry:numbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(),entry.getValue());
        }

    }
}
