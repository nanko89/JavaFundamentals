package August2019;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double resultPlunder = 0;

        for (int i = 1; i <=days ; i++) {
            resultPlunder += dailyPlunder;
            if (i % 3 == 0){
                resultPlunder += dailyPlunder*0.50;
            }
            if (i % 5 == 0){
                resultPlunder = resultPlunder*0.70;
            }

        }
            if (resultPlunder >= expectedPlunder){
                System.out.printf("Ahoy! %.2f plunder gained.", resultPlunder);
            }else {
                double percent = resultPlunder/expectedPlunder * 100;
                System.out.printf("Collected only %.2f%% of the plunder.",percent);
            }
    }
}
