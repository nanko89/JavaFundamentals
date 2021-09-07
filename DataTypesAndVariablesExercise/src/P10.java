import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distancePokeTargetM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int counerPokes = 0;

        double halfPokePower = pokePowerN / 2.0;

        while (pokePowerN >= distancePokeTargetM){
            if (pokePowerN == halfPokePower && exhaustionFactorY != 0){
                pokePowerN /= exhaustionFactorY;
            }else {
            counerPokes++;
                pokePowerN -= distancePokeTargetM;
            }
        }
        System.out.println(pokePowerN);
        System.out.println(counerPokes);

    }
}
