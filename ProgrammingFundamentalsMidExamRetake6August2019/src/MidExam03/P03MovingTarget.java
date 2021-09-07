package MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> target = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input =scanner.nextLine();

        while (!input.equals("End")){
            String[] tokens = input.split(" ");
            String command = tokens[0];
            int index = Integer.parseInt(tokens[1]);
            int value = Integer.parseInt(tokens[2]);
            boolean isValidIndex = isValidIndex(index,target);
            switch (command){
                case "Shoot":
                    if (isValidIndex){
                        if (target.get(index) > value){
                            target.set(index, target.get(index) - value);
                        }else {
                            target.remove(index);
                        }
                    }
                    break;
                case "Add":
                    if (isValidIndex){
                        target.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":
                    int startIndex = index - value;
                    int endIndex = index + value;
                    if (startIndex >= 0 && endIndex < target.size()){
                        for (int i = endIndex; i >= startIndex ; i--) {
                            target.remove(i);
                        }
                    }else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }


            input = scanner.nextLine();
        }
        for (int i = 0; i < target.size() - 1 ; i++) {
            System.out.print(target.get(i) + "|");
        }
        System.out.print(target.get(target.size() - 1));
    }

    private static boolean isValidIndex(int index, List<Integer> target) {
        return index >= 0 && index < target.size();
    }
}
