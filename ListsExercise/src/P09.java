import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemonDistance = Arrays.stream(scanner.nextLine()
                .split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int sumPokemon = 0;

        while (!pokemonDistance.isEmpty()) {
            int index = Integer.parseInt(scanner.nextLine());

            if (index >= 0 && index <= pokemonDistance.size() - 1) {
                int currentElement = pokemonDistance.get(index);
                sumPokemon += currentElement;
                pokemonDistance.remove(index);
                changeListContent(pokemonDistance, currentElement);
            } else if (index < 0) {
                int element = pokemonDistance.get(0);
                sumPokemon += element;
                pokemonDistance.set(0, pokemonDistance.get(pokemonDistance.size()-1));
                changeListContent(pokemonDistance, element);
            } else {
                int element = pokemonDistance.get(pokemonDistance.size()-1);
                sumPokemon += element;
                pokemonDistance.set((pokemonDistance.size()-1), pokemonDistance.get(0));
                changeListContent(pokemonDistance, element);
            }
        }
        System.out.println(sumPokemon);
    }

    static void changeListContent(List<Integer> numbersList, int element) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) <= element){
                numbersList.set(i, numbersList.get(i) + element);
            } else {
                numbersList.set(i, numbersList.get(i) - element);
            }
        }
    }
}
