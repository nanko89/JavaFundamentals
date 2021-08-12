import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guest = new ArrayList<>();


        for (int i = 0; i <n ; i++) {
                String[] input = scanner.nextLine().split(" ");
                String name = input[0];
                if (input.length > 3){
                    if (guest.contains(name)){
                        guest.remove(name);
                    }else {
                        System.out.printf("%s is not in the list!%n",name);
                    }
                }else {
                    if (guest.contains(name)){
                        System.out.printf("%s is already in the list!%n", name);
                    }else {
                        guest.add(name);
                    }
                }

        }
        for (int i = 0; i < guest.size(); i++) {
            System.out.println(guest.get(i));
        }
    }
}
