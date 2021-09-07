import java.util.*;


public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> words = new LinkedHashMap<>();
        for (int i = 0; i < n; i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            words.putIfAbsent(word, new ArrayList<>());
            words.get(word).add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            List<String> synonyms = entry.getValue();
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", synonyms));
        }
    }
}
