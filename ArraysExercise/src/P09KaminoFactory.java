import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequence = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int bestIndex = 0;
        int currentIndex = 0;
        int bestSum = 0;
        int countNumberOfElements = 0;
        int bestPositin = 0;
        int currentSum = 1;
        int currentLength = 0;
        int bestLength = 0;
        int[] result = new int[lengthOfSequence];
        boolean isSameIndex = false;
        int sameIndexSum = 0;
        while (!input.equals("Clone them!")){
            countNumberOfElements++;
            int[] arr = Arrays.stream(input.split("!")).mapToInt(Integer::parseInt).toArray();

            for (int index = 0; index < arr.length ; index++) {
                int value = arr[index];

                if (value == 1){
                    for (int j = index+1; j <arr.length - 1 ; j++) {
                        if (value >= arr[j]){
                            currentSum+=arr[j];
                            currentLength++;
                            currentIndex = index;
                        }else {
                            currentSum = 1;
                            currentLength = 0;

                        }
                    }
                        if (currentLength > bestLength){
                            bestLength = currentLength;
                            bestPositin = countNumberOfElements;
                            result = arr;
                        }else  if (currentLength == bestLength){
                            if (currentIndex < bestIndex){
                                bestIndex = currentIndex;
                                bestPositin = countNumberOfElements;
                                result=arr;
                            }else if (currentIndex == bestIndex){
                                isSameIndex = true;
                                sameIndexSum = currentSum;
                                if (currentSum > bestSum){
                                    bestSum = currentSum;
                                    bestPositin = countNumberOfElements;
                                    result = arr;
                                }
                            }
                        }else {
                            currentLength = 0;
                            currentIndex = 0;
                            currentSum = 0;
                        }
                }
            }
            input = scanner.nextLine();

        }
        if (isSameIndex){
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestPositin, sameIndexSum);
        }else {
            System.out.printf("Best DNA sample %d with sum: %d.%n", bestPositin, bestSum);
        }
        System.out.println(result);
    }
    }

