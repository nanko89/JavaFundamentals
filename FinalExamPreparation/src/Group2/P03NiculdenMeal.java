package Group2;

import java.util.*;

public class P03NiculdenMeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> likedMeals = new TreeMap<>();
        int unlikeMeals = 0;
        String line = scanner.nextLine();

        while (!line.equals("Stop")) {
            String[] split = line.split("-");
            String type = split[0];
            String guestName = split[1];
            String mealName = split[2];

            switch (type) {
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
                default:
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
            line = scanner.nextLine();

        }
            likedMeals.entrySet()
                    .stream()
                    .sorted((a,b) -> b.getValue().size() - a.getValue().size())
                    .forEach(e -> System.out.println(e.getKey() + ": " + printList(e.getValue())));
        System.out.println("Unliked meals: " + unlikeMeals);
    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]","");
    }

}

