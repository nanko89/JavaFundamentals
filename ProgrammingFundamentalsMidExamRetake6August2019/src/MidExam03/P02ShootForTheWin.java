package MidExam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> target = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countShots = 0;
        List <Integer> indexChange = new ArrayList<>();

        while (!input.equals("End")){
            int indexOfTarget = Integer.parseInt(input);
            indexChange.add(indexOfTarget);
            if (indexOfTarget >= 0 && indexOfTarget < target.size()){
                countShots++;
                int currentTarget =target.get(indexOfTarget);
                target.set(indexOfTarget, -1);
                for (int i = 0; i < target.size(); i++) {
                    if (target.get(i) != -1) {
                        if (currentTarget < target.get(i)) {
                            target.set(i, target.get(i) - currentTarget);
                        }else {
                            target.set(i,target.get(i) + currentTarget );
                        }
                    }
                }

            }
            input =scanner.nextLine();

        }
        System.out.printf("Shot targets: %d -> ",countShots);
        System.out.println(target.toString().replaceAll("[\\[\\],]", ""));
    }
}
