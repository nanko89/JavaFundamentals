import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfBalls = Integer.parseInt(scanner.nextLine());

        int maxSnow = 0;
        int maxTime = 0;
        int maxQuality = 0;
        long maxValue = 0;

        for (int i = 0; i < numberOfBalls; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            long snowballValue = (long) Math.pow(snowballSnow/snowballTime, snowballQuality);

            if (maxValue < snowballValue) {
                maxValue = snowballValue;
                maxQuality = snowballQuality;
                maxSnow = snowballSnow;
                maxTime = snowballTime;
            }

        }
        System.out.printf("%d : %d = %d (%d)",maxSnow,maxTime,maxValue,maxQuality );
    }
}
