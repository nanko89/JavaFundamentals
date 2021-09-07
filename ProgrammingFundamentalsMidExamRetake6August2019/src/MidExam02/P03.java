package MidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        double averageNum = 0;
        List<Integer> topNum = new ArrayList<>();

        for (int i = 0; i <numbers.size(); i++) {
            averageNum += numbers.get(i);
        }
        averageNum = averageNum / numbers.size();


        for (int i = 0; i <numbers.size(); i++) {
            if (numbers.get(i) > averageNum){
                topNum.add(numbers.get(i));
            }
        }
        if (topNum.isEmpty()){
            System.out.println("No");
            return;
        }
        Collections.sort(topNum);
        Collections.reverse(topNum);
        if (topNum.size() > 5){
        for (int i = 0; i < 5 ; i++) {
            System.out.print(topNum.get(i) + " ");
            }
        }else {
            System.out.println(topNum.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
