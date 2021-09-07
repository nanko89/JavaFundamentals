import java.util.Scanner;

public class P10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        double pokePowerDiff = pokePowerN * 0.5;
        int countPoke = 0;

        while ( pokePowerN >= distanceM ){
            countPoke++;
            pokePowerN -= distanceM;

            if (pokePowerN == pokePowerDiff && exhaustionFactorY != 0 ){
                pokePowerN = pokePowerN / exhaustionFactorY;
            }
        }

        System.out.println(pokePowerN);
        System.out.println(countPoke);
    }
}
