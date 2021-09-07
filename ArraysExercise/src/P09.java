
import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersOfElements = Integer.parseInt(scanner.nextLine());
        String bestDNA = "";
        int bestLength = 0;
        int bestSum = 0;
        int bestIndex = 0;
        int bestSample = 0;
        int counter = 0;
        String oneSequence = "";
        String input = scanner.nextLine();

        while (!input.equals("Clone them!")){
            counter ++;

            int currentLength = 0;
            int currentSum  = 0;
            String sequence = input.replaceAll("!+", "");
            String[] ones = sequence.split("0+");
            for (String one : ones) {
                if (one.length() > currentLength) {
                    currentLength = one.length();
                    oneSequence = one;
                }
                currentSum += one.length();
            }
            int currentIndex = sequence.indexOf(oneSequence);

            if (currentLength > bestLength){
                bestLength = currentLength;
                bestDNA = sequence;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestSample = counter;
            }else if (currentLength == bestLength && currentIndex < bestIndex || currentSum > bestSum){
                bestLength = currentLength;
                bestDNA = sequence;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestSample = counter;
            }else if (counter == 1){
                bestLength = currentLength;
                bestDNA = sequence;
                bestIndex = currentIndex;
                bestSum = currentSum;
                bestSample = counter;
            }
            input = scanner.nextLine();

        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSample, bestSum);
        String[] result = bestDNA.split("");
        System.out.println(String.join(" ", result));
    }
}
