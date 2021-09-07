package FinalExam02;

import java.util.*;

public class P03PlantDiscovery {
    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;


        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
            this.ratings = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void addRating(double rating){
            this.ratings.add(rating);
        }

        public void resetRating(){
            this.ratings.clear();
        }

        public double getAverageRating() {
            if (this.ratings.isEmpty()){
                return 0;
            }
            double average = 0;
            for (Double rating : this.ratings) {
                    average+= rating;
            }
            average = average/this.ratings.size();
            return average;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String ,Plant> plantsByName = new HashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] nameAndRarity = scanner.nextLine().split("<->");
           Plant p =  new Plant(nameAndRarity[0],Integer.parseInt(nameAndRarity[1]));
            plantsByName.put(p.getName(),p);
        }
        String command = scanner.nextLine();
        while (!command.equals("Exhibition")){

        String[] commandAndParameter = command.split(": ");
        switch (commandAndParameter[0]){

            case "Rate":
                String[] rateParameter = commandAndParameter[1].split(" - ");
                String  ratePlaneName = rateParameter[0];
                int rating = Integer.parseInt(rateParameter[1]);
                Plant ratePlant = plantsByName.get(ratePlaneName);
                if (ratePlant != null) {
                    ratePlant.addRating(rating);
                }else {
                    System.out.println("error");
                }
                break;
            case "Update":
                String[] updateParameter = commandAndParameter[1].split(" - ");
                String updatePlaneName = updateParameter[0];
                int rarity = Integer.parseInt(updateParameter[1]);

                Plant updatePlant =  plantsByName.get(updatePlaneName);
                if (updatePlant != null) {
                    updatePlant.setRarity(rarity);
                }else {
                    System.out.println("error");
                }
                break;
            case "Reset":
                String resetPlantName = commandAndParameter[1];

                Plant resentPlant = plantsByName.get(resetPlantName);
                if (resentPlant != null) {
                    resentPlant.resetRating();
                }else {
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("error");
                break;
        }
            command = scanner.nextLine();

        }
        System.out.println("Plants for the exhibition:");
        plantsByName.values()
                .stream()
                .sorted((a,b)->{
                    if(a.getRarity() != b.getRarity()){
                       return Integer.compare(b.getRarity(),a.getRarity());
                    }else {
                        return Double.compare(b.getAverageRating(),a.getAverageRating());
                    }
                })
                .map(p -> "- "+ p.getName() +"; Rarity: "+ p.getRarity()+"; Rating: " +String.format("%.2f",p.getAverageRating()))
                .forEach(System.out::println);
    }
}
