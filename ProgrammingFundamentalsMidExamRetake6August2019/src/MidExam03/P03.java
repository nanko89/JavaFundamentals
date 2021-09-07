package MidExam03;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> target = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String inpit = scanner.nextLine();

        while (!inpit.equals("End")){
            String[] token = inpit.split(" ");
            String command = token[0];
            int index = Integer.parseInt(token[1]);
            boolean isValidIndex = isValid(index,target.size());
            switch (command){
                case "Shoot":
                    int power = Integer.parseInt(token[2]);
                    if (isValidIndex){
                        int currentShoot = target.get(index);
                        if (currentShoot > power){
                        target.set(index, currentShoot - power);
                        }else {
                            target.remove(index);
                        }
                    }
                    break;
                case "Add":
                    int value = Integer.parseInt(token[2]);
                    if (isValidIndex){
                        target.add(index, value);
                    }else {
                        System.out.println("Invalid placement!");
                    }

                    break;
                case "Strike":
                    int radius = Integer.parseInt(token[2]);
                    int startIndex = index - radius;
                    int endIndex = index + radius;

                    if (startIndex >= 0 && endIndex < target.size()) {
                        for (int i = endIndex; i >= startIndex ; i--) {
                            target.remove(i);
                        }
                    }else {
                        System.out.println("Strike missed!");
                    }


                    break;
            }
            inpit = scanner.nextLine();

        }
        for (int i = 0; i < target.size()-1; i++) {
            System.out.print(target.get(i) + "|");
        }
        System.out.print(target.get(target.size() - 1));
    }

    private static boolean isValid(int index, int size) {
        return index >= 0 && index< size;
    }
}
