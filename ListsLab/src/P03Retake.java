import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < Math.min(firstList.size(), secondList.size()); i++) {
            newList.add(firstList.get(i));
            newList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()) {
            for (int i = secondList.size(); i < firstList.size(); i++) {
                newList.add(firstList.get(i));
            }
        } else if (secondList.size() > firstList.size()){
            for (int i = firstList.size(); i < secondList.size(); i++) {
                newList.add(secondList.get(i));
            }
        }

        System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
    }
}
