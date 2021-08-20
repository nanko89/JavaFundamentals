package FinalExam02;

import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> nameRarity = new HashMap<>();
        Map<String, List<Integer>> nameRating = new HashMap<>();

         int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
            String plantName = nameAndRarity[0];
            nameRarity.put(plantName,Integer.parseInt(nameAndRarity[1]));
            nameRating.put(plantName,new ArrayList<>());
        }
        String input = scanner.nextLine();
        while (!input.equals("Exhibition")){


            String[] command = input.split(": ");
            switch (command[0]){

                case "Rate":
                    String[] rateParameter = command[1].split(" - ");
                    String  ratePlaneName = rateParameter[0];
                    int rating = Integer.parseInt(rateParameter[1]);

                    List<Integer> ratings = nameRating.get(ratePlaneName);

                    if (ratings != null) {
                        ratings.add(rating);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Update":
                    String[] updateParameter = command[1].split(" - ");
                    String updatePlaneName = updateParameter[0];
                    int rarity = Integer.parseInt(updateParameter[1]);

                   if (nameRarity.containsKey(updatePlaneName)){
                       nameRarity.put(updatePlaneName,rarity);
                   } else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    String resetPlantName = command[1];

                    List<Integer> resetRatings = nameRating.get(resetPlantName);
                    if (resetRatings != null) {
                        resetRatings.clear();
                    }else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        nameRarity.entrySet()
                .stream()
                .sorted((a,b) ->{
                    int aRarity = a.getValue();
                    int bRarity = b.getValue();
                    if (aRarity != bRarity){
                        return Integer.compare(bRarity, aRarity);
                    }else {
                        List<Integer> aRatingList = nameRating.get(a.getKey());
                        List<Integer> bRatingList = nameRating.get(b.getKey());
                        double aAverageRating =  calculationAverage(aRatingList);
                        double bAverageRating = calculationAverage(bRatingList);
                        return Double.compare(bAverageRating,aAverageRating);
                    }
                })
                .map(entry -> "- "+ entry.getKey() +"; Rarity: "+ entry.getValue()+"; Rating: "
                        +String.format("%.2f",calculationAverage(nameRating.get(entry.getKey()))))
                .forEach(System.out::println);

    }
    static double calculationAverage (List<Integer> numbers){
        if (numbers.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum/numbers.size();
    }
}
