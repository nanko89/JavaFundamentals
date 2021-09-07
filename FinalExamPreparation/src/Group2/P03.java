package Group2;

import java.util.*;

public class P03 {
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

            if (type.equals("Like")) {

                List<String> guestMeal = likedMeals.get(guestName);
                if (guestMeal == null) {
                    guestMeal = new ArrayList<>();
                }
                if (!guestMeal.contains(mealName)) {
                    guestMeal.add(mealName);
                }
                likedMeals.put(guestName, guestMeal);
            } else {
                if (!likedMeals.containsKey(guestName)) {
                    System.out.printf("%s is not at the party%n", guestName);
                } else {
                    List<String> meals = likedMeals.get(guestName);
                    if (!meals.contains(mealName)) {
                        System.out.printf("%s doesn't have the %s in his/her collection%n", guestName, mealName);
                    } else {
                        meals.remove(mealName);
                        unlikeMeals++;

                        System.out.printf("%s doesn't like the %s%n", guestName, mealName);
                        likedMeals.put(guestName, meals);
                    }
                }
            }
            line = scanner.nextLine();

        }
        likedMeals.entrySet()
                .stream()
                .sorted((a,b) -> {
                    int compare = b.getValue().size() - a.getValue().size();
                    if (compare == 0){
                        return a.getKey().compareTo(b.getKey());
                    }else {
                        return compare;
                    }
                })
                .forEach(e -> System.out.println(e.getKey() + ": " + printList(e.getValue())));
        System.out.println(unlikeMeals + "");
    }

    private static String printList(List<String> value) {
        return value.toString().replaceAll("[\\[\\]]","");
    }

}

