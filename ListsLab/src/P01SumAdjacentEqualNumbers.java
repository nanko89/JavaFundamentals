import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" ")).
                map(Double::parseDouble).
                collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            if (numbersList.get(i).equals(numbersList.get(i+1))){
                double sum = numbersList.get(i) + numbersList.get(i+1);
                numbersList.set(i,sum);
                numbersList.remove(i+1);
                i = -1;
            }

        }
        String output = joinElementsByDelimeter(numbersList);
        System.out.print(output);
    }

    private static String joinElementsByDelimeter(List<Double> numbersList) {
        StringBuilder output = new StringBuilder();
        for (double item:numbersList) {
        output.append(new DecimalFormat("0.#").format(item)).append(" ");
        }
        return output.toString();
    }
}

