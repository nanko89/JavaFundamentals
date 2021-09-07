package MidExam02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());

        int totalPerHour = first + second + third;
        int countHour = 0;
        while (studentsCount > 0){
            countHour++;
            if (countHour % 4 != 0) {
                studentsCount -= totalPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", countHour);

    }
}
