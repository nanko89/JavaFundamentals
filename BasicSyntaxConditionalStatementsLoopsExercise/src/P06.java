import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sum =0;

        while (num != 0){
            int currentNum = num % 10;
            int fact = 1;
            for (int i = 1; i <=currentNum ; i++) {
                fact = fact * i;
            }
            sum += fact;
            num /= 10;
        }
            if (startNum == sum){
                 System.out.println("yes");
            }else {
                System.out.println("no");
            }
    }
}
