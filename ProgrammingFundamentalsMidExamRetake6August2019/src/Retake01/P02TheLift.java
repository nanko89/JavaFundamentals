package Retake01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleForLift = Integer.parseInt(scanner.nextLine());
        List<Integer> wagonsLift = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPeople = 4;

        for (int i = 0; i < wagonsLift.size(); i++) {
            int currentWagon = wagonsLift.get(i) - maxPeople;
            if (peopleForLift >= maxPeople - wagonsLift.get(i)){
                peopleForLift += currentWagon;
                wagonsLift.set(i,maxPeople);
            }else if (peopleForLift < maxPeople - wagonsLift.get(i)){
                wagonsLift.set(i,peopleForLift);
                peopleForLift +=currentWagon;
                break;
            }
            if (peopleForLift <= 0){
                break;
            }

        }
        boolean isHaveEmptyWagon = false;
        for (int currentWagon : wagonsLift) {
            if (peopleForLift <= 0 && currentWagon < 4) {
                isHaveEmptyWagon = true;
            }
        }
        if (peopleForLift > 0){
            System.out.printf("There isn't enough space! %d people in a queue!%n", peopleForLift);

        }else if (isHaveEmptyWagon){
            System.out.println("The lift has empty spots!");
        }

        System.out.println(wagonsLift.toString().replaceAll("[\\[\\],]", ""));

    }
}
