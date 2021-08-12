import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
        List<String> names = Arrays.stream(nameInput.split("\\s+")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")){
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            if (commandName.equals("merge")){
                int startIndex = Integer.parseInt(commandData[1]);
                int endIndex = Integer.parseInt(commandData[2]);

                if (startIndex < 0){
                    startIndex = 0;
                }
                if (endIndex > names.size() - 1){
                    endIndex = names.size() - 1;
                }

                boolean isValidStartIndex = isValidIndex(startIndex,names.size());
                boolean isValidEndIndex = isValidIndex(endIndex, names.size());
                if (isValidEndIndex && isValidStartIndex) {

                    StringBuilder resultMerge = new StringBuilder();

                    for (int i = startIndex; i <= endIndex; i++) {
                        resultMerge.append(names.get(i));
                    }
                    for (int i = startIndex; i <= endIndex; i++) {
                        names.remove(startIndex);
                    }
                    names.add(startIndex, resultMerge.toString());
                }
            }else if (commandName.equals("divide")){
                int index = Integer.parseInt(commandData[1]);
                int partitions = Integer.parseInt(commandData[2]);
                String elementForDivide = names.get(index);
                
            }

            command = scanner.nextLine();

        }

    }
    public static boolean isValidIndex(int index, int size){
        return index >= 0 && index <= size -1;
    }
}
