import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int currentDays = Integer.parseInt(scanner.nextLine());

        if (currentDays >= 1 && currentDays <=7){
            System.out.println(days[currentDays - 1]);
        }else{
            System.out.println("Invalid day!");
        }

    }
}
