
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> quality = new ArrayList<>(drumSet);
        String input = scanner.nextLine();

        while (!input.equals("Hit it again, Gabsy!") ){

            int currentPower = Integer.parseInt(input);
            for (int i = 0; i < quality.size() ; i++) {
                int currentQuality = quality.get(i) - currentPower;
                if (currentQuality <= 0){
                    if (savings - drumSet.get(i)*3 >= 0){
                    savings -= drumSet.get(i)*3;
                    quality.set(i, drumSet.get(i));
                    }else {
                        quality.remove(i);
                        drumSet.remove(i);

                    }
                }else {
                    quality.set(i, currentQuality);
                }
            }

            input = scanner.nextLine();

        }
        System.out.println(quality.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
