import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int minLength = Math.min(firstList.size(),secondList.size());

        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < minLength; i++) {
            newList.add(firstList.get(i));
            newList.add(secondList.get(i));
        }
        if (firstList.size() > secondList.size()){
            for (int i = minLength; i <firstList.size() ; i++) {
                newList.add(firstList.get(i));
            }
        }else {
            for (int i = minLength; i < secondList.size() ; i++) {
                newList.add(secondList.get(i));
            }
        }
        System.out.print(newList.toString().replaceAll("[\\[\\],]", ""));
    }
}
