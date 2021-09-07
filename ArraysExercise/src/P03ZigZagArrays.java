import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int[] firstNum = new int[number];
        int[] secondNum = new int[number];
        for (int i = 0; i < number; i++) {
            int[] numbers  = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0){
                firstNum[i] += numbers [0];
                secondNum[i] += numbers [1];
            }else {
                firstNum [i] += numbers[1];
                secondNum[i]+= numbers [0];
            }
        }
        StringBuilder first = new StringBuilder();
        for (int j : firstNum) {
            first.append(j + " ");
        }
        StringBuilder second = new StringBuilder();
        for (int j : secondNum) {
            second.append(j + " ");
        }
        System.out.println(first);
        System.out.println(second);
        }
    }

