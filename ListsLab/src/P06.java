import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        for (int i = 0; i < n  ; i++) {
            String product = scanner.nextLine();
            products.add(product);
        }
        Collections.sort(products);

        for (int i = 1; i <=products.size() ; i++) {
            System.out.println(i + "." + products.get(i-1));
        }
    }
}