import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCommands = Integer.parseInt(scanner.nextLine());
        List<String> listName = new ArrayList<>();

        for (int i = 0; i < countCommands; i++) {
            String[] currentCommand = scanner.nextLine().split(" ");
            String name = currentCommand[0];
            if (currentCommand.length == 3){
                if (listName.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    listName.add(name);
                }
            }else {
                if (listName.contains(name)){
                    listName.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String s : listName) {
            System.out.println(s);
        }
    }
}
