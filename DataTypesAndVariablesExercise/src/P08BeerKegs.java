import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double volumeOfKeg = 0;
        double biggestVolume = 0;
        String biggestKeg = "";

        for (int i = 0; i < numberOfKegs; i++) {
            String modelKegs = scanner.nextLine();
            double radiusKeg = Double.parseDouble(scanner.nextLine());
            int heightKeg = Integer.parseInt(scanner.nextLine());
            volumeOfKeg = Math.PI * radiusKeg * radiusKeg * heightKeg;

            if (biggestVolume < volumeOfKeg){
                biggestKeg = modelKegs;
                biggestVolume = volumeOfKeg;
            }
        }
        System.out.println(biggestKeg);
    }
}
