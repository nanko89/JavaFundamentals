import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSetPower = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        List<Integer> drum = new ArrayList<>(drumSetPower);
        while (!input.equals("Hit it again, Gabsy!")){
            int currentHit = Integer.parseInt(input);
            for (int i = 0; i < drum.size(); i++) {
                int currentDrum = drum.get(i) - currentHit;
                if (currentDrum > 0){
                    drum.set(i, currentDrum);
                }else {
                    if (savings - drumSetPower.get(i) * 3 < 0) {
                        drum.remove(i);
                        drumSetPower.remove(i);
                        i--;
                    } else {
                        drum.set(i, drumSetPower.get(i));
                        savings -= drumSetPower.get(i) * 3;
                    }
                }
            }

            input = scanner.nextLine();

        }
        System.out.println(drum.toString().replaceAll("[\\[\\],]", ""));
        System.out.printf("Gabsy has %.2flv.", savings);
    }
}
