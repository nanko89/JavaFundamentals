import java.util.*;
import java.util.stream.Collectors;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }
        }

        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }


    }
}
