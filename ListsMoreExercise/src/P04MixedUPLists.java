import java.util.*;
import java.util.stream.Collectors;

public class P04MixedUPLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int startInterval;
        int endInterval;

        if (firstList.size() > secondList.size()){
            startInterval = Math.min(firstList.get(firstList.size()-1),firstList.get(firstList.size()-2 ));
            endInterval = Math.max(firstList.get(firstList.size()-1),firstList.get(firstList.size()-2 ));
        }else {
            startInterval = Math.min(secondList.get(0),secondList.get(1));
            endInterval = Math.max(secondList.get(0),secondList.get(1));
        }
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < Math.min(firstList.size(), secondList.size() ); i++) {
            newList.add(firstList.get(i));
            newList.add(secondList.get(secondList.size() - 1 - i));
        }
        List<Integer> finishList = new ArrayList<>();
        for (int currentDigit : newList) {
            if (currentDigit > startInterval && currentDigit < endInterval) {
                finishList.add(currentDigit);
            }
        }
        Collections.sort(finishList);
        System.out.println(finishList.toString().replaceAll("[\\[\\],]", ""));
    }
}
