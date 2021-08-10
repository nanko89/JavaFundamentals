import java.util.*;
import java.util.stream.Collectors;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int firstIndex;
        int secondIndex;
        if (first.size() > second.size()){
            firstIndex = first.get(first.size() - 1);
            secondIndex = first.get(first.size() - 2);
        }else {
            firstIndex = second.get(0);
            secondIndex = second.get(1);
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < Math.min(first.size() , second.size()); i++) {
            newList.add(first.get(i));
            newList.add(second.get(second.size() - 1 - i));
        }
        List<Integer> printNum = new ArrayList<>();
        int startIndex = Math.min(firstIndex,secondIndex);
        int endIndex = Math.max(firstIndex,secondIndex);

            for (Integer integer : newList) {
                if (integer > startIndex && integer < endIndex) {
                    printNum.add(integer);
                }
            }

        Collections.sort(printNum);
        System.out.println(printNum.toString().replaceAll("[\\[\\],]", ""));
    }
}
