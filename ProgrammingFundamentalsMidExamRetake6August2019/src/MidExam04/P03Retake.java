package MidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int lastPosition = 0;
        while (!input.equals("Love!")){
            String[] token = input.split(" ");

            int index = Integer.parseInt(token[1]);
            lastPosition += index;
            if (lastPosition >= numbers.size()){
                lastPosition = 0;
            }
            if (lastPosition >= 0 && lastPosition < numbers.size()){
            if (numbers.get(lastPosition) == 0){
                System.out.printf("Place %d already had Valentine's day.%n",lastPosition);
            }else{
                numbers.set(lastPosition, numbers.get(lastPosition) - 2);
                if (numbers.get(lastPosition) == 0) {
                    System.out.printf("Place %d has Valentine's day.%n", lastPosition);
                    }
                }
            }

            input = scanner.nextLine();

        }
        System.out.printf("Cupid's last position was %d.%n", lastPosition);
        boolean hasNoValentine = false;
        int fail = 0;
        for (Integer number : numbers) {
            if (number > 0) {
                fail++;
                hasNoValentine = true;
            }
        }
        if (hasNoValentine){
            System.out.printf("Cupid has failed %d places.", fail);
        }else {
            System.out.println("Mission was successful.");
        }

    }
}
