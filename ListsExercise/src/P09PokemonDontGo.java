import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09PokemonDontGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemonDistance = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sumPokemon = 0;
        while (!pokemonDistance.isEmpty()){

            int index = Integer.parseInt(scanner.nextLine());
            if (index >= 0 && index < pokemonDistance.size()) {
                int currentElement = pokemonDistance.get(index);
                sumPokemon += currentElement;
                pokemonDistance.remove(index);
                changeElements(pokemonDistance, currentElement);
            } else if (index < 0){
                int currentElement = pokemonDistance.get(0);
                sumPokemon += currentElement;
                pokemonDistance.set(0, pokemonDistance.get(pokemonDistance.size() - 1));
                changeElements(pokemonDistance, currentElement);
            }else {
                int currentElement = pokemonDistance.get(pokemonDistance.size()-1);
                sumPokemon += currentElement;
                pokemonDistance.set(pokemonDistance.size() - 1, pokemonDistance.get(0));
                changeElements(pokemonDistance, currentElement);
            }
        }
        System.out.println(sumPokemon);
    }

    private static List<Integer> changeElements(List<Integer> pokemonDistance, int currentElement) {
        for (int i = 0; i < pokemonDistance.size() ; i++) {
            if (currentElement < pokemonDistance.get(i)) {
                pokemonDistance.set(i, pokemonDistance.get(i) - currentElement);
            }else {
                pokemonDistance.set(i, currentElement + pokemonDistance.get(i));
            }

        }
        return pokemonDistance;
    }

}
