import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09Retake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemonDistance = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        while (!pokemonDistance.isEmpty()){
            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < pokemonDistance.size()) {
            int currentElement = pokemonDistance.get(index);
            sum += currentElement;
                pokemonDistance.remove(index);
                changeElement(pokemonDistance,currentElement);
            }else if (index < 0){
                int currentElement = pokemonDistance.get(0);
                sum += currentElement;
                pokemonDistance.set(0, pokemonDistance.get(pokemonDistance.size()-1));
                changeElement(pokemonDistance,currentElement);
            }else if (index > pokemonDistance.size() - 1){
                int currentElement = pokemonDistance.get(pokemonDistance.size() - 1);
                sum += currentElement;
                pokemonDistance.set(pokemonDistance.size() - 1, pokemonDistance.get(0));
                changeElement(pokemonDistance,currentElement);
            }
        }
        System.out.println(sum);
    }

    private static void changeElement(List<Integer> pokemonDistance, int currentElement) {
        for (int i = 0; i < pokemonDistance.size(); i++) {
            if (currentElement < pokemonDistance.get(i)) {
                pokemonDistance.set(i, pokemonDistance.get(i) - currentElement);
            } else {
                pokemonDistance.set(i, pokemonDistance.get(i) + currentElement);
            }
        }

    }
}
