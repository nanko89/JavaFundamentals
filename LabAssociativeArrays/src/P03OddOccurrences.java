import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().toLowerCase(Locale.ROOT).split(" ");
        Map<String,Integer> word = new LinkedHashMap<>();
        for (String currentWord : input) {
            word.putIfAbsent(currentWord,0);
            word.put(currentWord, word.get(currentWord) +1);
        }
        List<String> odds = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : word.entrySet()) {
            if (stringIntegerEntry.getValue() % 2 == 1){
                odds.add(stringIntegerEntry.getKey());
            }
        }
        System.out.printf("%s", String.join(", ", odds));
        /*for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i < odds.size()-1){
                System.out.print(", ");
            }
        }*/

    }
}
