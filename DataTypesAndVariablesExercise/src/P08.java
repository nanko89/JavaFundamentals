import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKeg = Integer.parseInt(scanner.nextLine());

        double biggestKeg = 0;
        String nameOfBigetsKeg = "";

        for (int i = 0; i < countKeg; i++) {
        String modelKeg = scanner.nextLine();
        double radiusKeg = Double.parseDouble(scanner.nextLine());
        int heightKeg = Integer.parseInt(scanner.nextLine());
        double currentKegVolume = Math.PI * Math.pow(radiusKeg,2) * heightKeg;

        if (currentKegVolume > biggestKeg){
            biggestKeg = currentKegVolume;
            nameOfBigetsKeg = modelKeg;
        }

        }

        System.out.println(nameOfBigetsKeg);
    }
}
