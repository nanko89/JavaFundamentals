package MidExam04;

import java.util.Scanner;

public class P01NationalCourt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int peolpleCount = Integer.parseInt(scanner.nextLine());

        int allEmployeeTimePerHour = first + second + third;
        int totalHour = 0;

        while (peolpleCount > 0){

            totalHour++;
            if (totalHour % 4 == 0){

            }else {
                peolpleCount -= allEmployeeTimePerHour;
            }
        }
        System.out.printf("Time needed: %dh.", totalHour);
    }
}
