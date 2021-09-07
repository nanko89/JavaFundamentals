package MidExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequences = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String input = scanner.nextLine();
        int counter = 0;
        while (!input.equals("end")){
            counter++;
            String[] index = input.split(" ");
            int firstIndex = Integer.parseInt(index[0]);
            int secondIndex = Integer.parseInt(index[1]);
            boolean firstValidIndex = validIndex(sequences.size(), firstIndex);
            boolean secondValidIndex = validIndex(sequences.size(), secondIndex);
            if (firstValidIndex && secondValidIndex && firstIndex != secondIndex){
                if (sequences.get(firstIndex).equals(sequences.get(secondIndex))){
                    System.out.printf("Congrats! You have found matching elements - %s!%n", sequences.get(firstIndex));
                    String equals = sequences.get(firstIndex);
                    sequences.remove(equals);
                    sequences.remove(equals);
                }else {
                    System.out.println("Try again!");
                }
            }else {
                int halfSize = sequences.size()/2;
                sequences.add(halfSize,"-" + counter + "a");
                sequences.add(halfSize,"-" + counter + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            if (sequences.isEmpty()){
                System.out.printf("You have won in %d turns!", counter);
                return;
            }
            input = scanner.nextLine();

        }
        System.out.println("Sorry you lose :(");
        System.out.println(sequences.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean validIndex(int size, int index) {
        return index>= 0 && index < size;
    }
}
