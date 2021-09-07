package MidExam05;

import java.util.Scanner;

public class P01BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());
        int countLecture = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double[] bonusArray = new double[countStudent];
        int[] studentAttendance = new int[countStudent];
        double maxBonus = Double.MIN_VALUE;
        int currentLecture = 0;

        for (int i = 0; i < countStudent; i++) {
            int attendancesOfStudent = Integer.parseInt(scanner.nextLine());
            studentAttendance[i] = attendancesOfStudent;
            //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
            if (countLecture != 0) {
                double totalBonus = attendancesOfStudent * 1.0 / countLecture * (5 + initialBonus);
                bonusArray[i] = totalBonus;
            }
        }
        for (int i = 0; i < bonusArray.length; i++) {
            if (bonusArray[i] > maxBonus) {
                maxBonus = bonusArray[i];
                currentLecture = studentAttendance[i];
            }
        }
        if (countLecture == 0) {
            System.out.println("Max Bonus: 0.");
            System.out.println("The student has attended 0 lectures.");
        } else {
            System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));

            System.out.printf("The student has attended %d lectures.", currentLecture);
        }
    }
}
