package MidExam04;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int countPeople = Integer.parseInt(scanner.nextLine());
        int time = 0;

        while (countPeople > 0){
            time++;
            if (time % 4 != 0){
                countPeople -= first + second + third;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
