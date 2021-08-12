import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 1;
        int third = 1;
        int four = first + second + third;
        List<Integer> result = new ArrayList<>();

        if (num == 1) {
            System.out.println(1);
        }else if (num == 2){
            System.out.println(1 + " " + 1);
        }else if (num == 3) {
            System.out.println(1 + " " + 1 + " " + 2);
        }else {
            for (int i = 0; i < num ; i++){
                first = second;
                second = third;
                third = four;
                four = first + second + third;
                result.add(first);
            }
            System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
        }



    }
}
