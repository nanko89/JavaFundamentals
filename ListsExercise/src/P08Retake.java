import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> word = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("3:1")){
            String[] token = input. split("\\s+");
            String command = token[0];
            if ("merge".equals(command)) {
                int startIndex = Integer.parseInt(token[1]);
                int endIndex = Integer.parseInt(token[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex >= word.size()) {
                    endIndex = word.size() - 1;
                }
                boolean isValidStart = isValidIndex(startIndex, word.size());
                boolean isValidEnd = isValidIndex(endIndex, word.size());
                if (isValidEnd && isValidStart) {
                    StringBuilder mergeElement = new StringBuilder();
                    for (int i = startIndex; i <= endIndex; i++) {
                        mergeElement.append(word.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        word.remove(startIndex);
                    }
                    word.add(startIndex, mergeElement.toString());
                }
            } else if ("divide".equals(command)) {
                int index = Integer.parseInt(token[1]);
                int partition = Integer.parseInt(token[2]);
                String currentElement = word.get(index);
                word.remove(word.get(index));
                int began = 0;
                int partSize = currentElement.length() / partition;
                for (int i = 1; i < partition; i++) {
                    word.add(index, currentElement.substring(began, began + partSize));
                    index++;
                    began += partSize;
                }
                word.add(index, currentElement.substring(began));
            }
            input = scanner.nextLine();

        }
        System.out.println(word.toString().replaceAll("[\\[\\],]",""));
    }

    private static boolean isValidIndex(int index, int size) {
        return index >= 0 && index < size;
    }
}
