package MidExam02;

import java.util.Scanner;

public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	On first three lines -  each employee efficiency -  integer in range [1 - 100]
//•	On the fourth line - students count – integer in range [0 – 10000]
//•	Input will always be valid and in the range specified

        int firstEmployeeStudentPerHour = Integer.parseInt(scanner.nextLine());
        int secondEmployeeStudentPerHour = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeStudentPerHour = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int totalPerHourAnswer = firstEmployeeStudentPerHour
                                + secondEmployeeStudentPerHour
                                +thirdEmployeeStudentPerHour;
        int neededTime = 0;

        while (studentsCount > 0 ){
            neededTime ++;
            if (neededTime % 4 == 0){

            }else {
                studentsCount -= totalPerHourAnswer;
            }
        }

        System.out.printf("Time needed: %dh.", neededTime);



    }
}
