import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            String[] command = input.split("\\s+");
            String currentCommand = command[0];
            switch (currentCommand){
                case "merge":
                    int startIndex =  Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    if (startIndex < 0){
                        startIndex = 0;
                    }
                    if (endIndex >= list.size()){
                        endIndex = list.size() -1;
                    }
                    boolean isValidStart = validIndex(startIndex,list);
                    boolean isValidEnd = validIndex(endIndex,list);

                    if (isValidEnd && isValidStart){
                        StringBuilder mergeElement = new StringBuilder();
                        for (int i = startIndex; i <=endIndex ; i++) {
                            mergeElement.append(list.get(i));
                        }
                        for (int i = startIndex; i <=endIndex ; i++) {
                            list.remove(startIndex);
                        }
                        list.add(startIndex, mergeElement.toString());
                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(command[1]);
                    int partitions = Integer.parseInt(command[2]);
                    String currentElement = list.get(index);
                    int partSize = currentElement.length() / partitions;

                    int began = 0;
                    list.remove(list.get(index));
                    for (int i = 1; i < partitions ; i++) {
                        list.add(index,currentElement.substring(began,began + partSize));
                        index++;
                        began += partSize;
                    }
                    list.add(index,currentElement.substring(began));

                    break;
            }
            input = scanner.nextLine();

        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static boolean validIndex(int index, List<String> list) {
        return index >= 0 && index < list.size();
    }
}
