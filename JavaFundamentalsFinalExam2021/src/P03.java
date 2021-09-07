import java.util.*;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> likedMeals = new TreeMap<>();
        int unlikeMeals = 0;

        String command = scanner.nextLine();

        while (!command.equals("Stop")){
            String[] data = command.split("-");

            String type = data[0];
            String guestName = data[1];
            String mealName = data[2];

            switch (type){
                case "Like":
                    List<String> guestMeal = likedMeals.get(guestName);
                    if (guestMeal == null) {
                        guestMeal = new ArrayList<>();
                    }
                    if (!guestMeal.contains(mealName)) {
                        guestMeal.add(mealName);
                    }
                    likedMeals.put(guestName, guestMeal);
                    break;
                case "Unlike":
                    if (!likedMeals.containsKey(guestName)) {
                        System.out.printf("%s is not at the party.%n", guestName);
                    } else {
                        List<String> meals = likedMeals.get(guestName);
                        if (!meals.contains(mealName)) {
                            System.out.printf("%s doesn't have the %s in his/her collection.%n", guestName, mealName);
                        } else {
                            meals.remove(mealName);
                            unlikeMeals++;

                            System.out.printf("%s doesn't like the %s.%n", guestName, mealName);
                            likedMeals.put(guestName, meals);
                        }
                    }
                    break;

            }


            command = scanner.nextLine();

        }
        likedMeals.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue().size() - a.getValue().size())
                .map(entry -> entry.getKey() +": " + entry.getValue().toString().replaceAll("[\\[\\]]", ""))
                .forEach(System.out::println);

        System.out.println("Unliked meals: " + unlikeMeals);

    }
}
