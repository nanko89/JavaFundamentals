package MidExam03;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = Arrays.stream(scanner.nextLine().split(" ")).
                        mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        int countShots = 0;
        while (!input.equals("End")){
            int currentIndex = Integer.parseInt(input);
            if (currentIndex >= 0 && currentIndex < target.length) {
                int currentValue = target[currentIndex];
                countShots++;
                target[currentIndex] = -1;
                for (int i = 0; i < target.length; i++) {

                    if (target[i] <= currentValue && target[i] != -1 ){
                        target[i] = target[i] + currentValue;
                    }else if (target[i] > currentValue && target[i] != -1){
                        target[i] = target[i] - currentValue;
                    }
                }

            }
            input = scanner.nextLine();

        }
        System.out.printf("Shot targets: %d -> ", countShots);
        System.out.println(Arrays.toString(target).replaceAll("[\\[\\],]", ""));
    }
}
