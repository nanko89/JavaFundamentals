
import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPeople = Integer.parseInt(scanner.nextLine());
        int maxPeopleInCourse = Integer.parseInt(scanner.nextLine());

        int totalCourse = totalPeople / maxPeopleInCourse;
        if (totalPeople % maxPeopleInCourse > 0){
            totalCourse ++;
        }
        System.out.println(totalCourse);
    }
}
