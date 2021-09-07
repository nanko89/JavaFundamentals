import java.util.Scanner;

public class P07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tankCapacity = 255;

        int numberOfLine = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfLine; i++) {
            int currentLiters = Integer.parseInt(scanner.nextLine());
            if (currentLiters <= tankCapacity){
                tankCapacity -= currentLiters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(255 - tankCapacity);

    }
}
