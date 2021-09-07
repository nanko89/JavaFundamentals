package MidExam05;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countStudent = Integer.parseInt(scanner.nextLine());
        int countLecture = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        int maxAttendances = Integer.MIN_VALUE;

        for (int i = 0; i < countStudent; i++) {
            int currentAttendances = Integer.parseInt(scanner.nextLine());
            if (currentAttendances > maxAttendances) {
                maxAttendances = currentAttendances;
            }
        }
        if (countLecture != 0) {
            double totalBonus = Math.ceil(maxAttendances * 1.0 / countLecture * (5 + initialBonus));
            System.out.printf("Max Bonus: %.0f.%n", totalBonus);
            System.out.printf("The student has attended %d lectures.", maxAttendances);
        } else {
            System.out.println("Max Bonus: 0.");
            System.out.println("The student has attended 0 lectures.");
        }
    }
}
