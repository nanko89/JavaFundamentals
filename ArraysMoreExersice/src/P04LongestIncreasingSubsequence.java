import java.util.*;

public class P04LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sec = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e)).toArray();

        int[] len = new int[sec.length];

        for (int x = 0; x < sec.length; x++) {
            len[x] = 1;
            for (int i = 0; i <= x - 1; i++) {
                if (sec[i] < sec[x] && len[i] + 1 > len[x]) {
                    len[x] = 1 + len[i];
                }
            }
        }
        int maxLen = 0;
        int lastIndex = -1;
        int[] prev = new int[len.length];
        for (int x = 0; x < sec.length; x++) {
            len[x] = 1;
            prev[x] = -1;
            for (int i = 0; i < x; i++) {
                if (sec[i] < sec[x] && (len[i] + 1 > len [x])){
                    len[x] = len [i] + 1;
                    prev [x] = i;
                }
                if (len[x] > maxLen){
                    maxLen = len[x];
                    lastIndex = x;
                }
            }
        }
        Object[] restoredList = restoredList(sec,prev,lastIndex);
        System.out.println();
            }

    private static Object[] restoredList(int[] sec, int[] prev, int lastIndex) {
        List<Integer> longestSec = new ArrayList<>();
        while (lastIndex != -1){
            longestSec.add(sec[lastIndex]);
            lastIndex = prev[lastIndex];
        }
        Collections.reverse(longestSec);
        return longestSec.toArray();
    }
}

  