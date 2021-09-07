package MidExam02;

import java.util.*;
import java.util.stream.Collectors;

public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }

        double average = sum * 1.0 / numbers.size();
        List<Integer> averageNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number > average) {
                averageNumbers.add(number);
            }
        }
        Collections.sort(averageNumbers);
        Collections.reverse(averageNumbers);

        if (averageNumbers.size() > 5){
            for (int i = 0; i < 5 ; i++) {
                System.out.print(averageNumbers.get(i) + " ");
            }
        }else if (!averageNumbers.isEmpty()){
            System.out.println(averageNumbers.toString().replaceAll("[\\[\\],]", ""));
        }else {
            System.out.println("No");
        }

    }
}


