import java.util.*;


public class demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String,List<Integer>>>dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        //{type} {name} {damage} {health} {armor}.
        for (int i = 0; i < n; i++) {


            String[] data = scanner.nextLine().split(" ");
            String type = data[0];
            String name = data[1];
            String damageString = data[2];
            String healthString = data[3];
            String armorString = data[4];

            int damage;
            int health;
            int armor;

            if (damageString.equals("null")) {
                damage = 45;
            } else {
                damage = Integer.parseInt(damageString);
            }

            if (!healthString.equals("null")) {
                health = Integer.parseInt(healthString);
            } else {
                health = 250;
            }

            if (!armorString.equals("null")) {
                armor = Integer.parseInt(armorString);
            } else {
                armor = 10;
            }
              dragons.putIfAbsent(type, new TreeMap<>());
            Map<String,List<Integer>> nameDragon = dragons.get(type);
            nameDragon.putIfAbsent(name, new ArrayList<>());
            List<Integer>valueDragon = nameDragon.get(name);
            if (valueDragon.isEmpty()){
                valueDragon.add(damage);
                valueDragon.add(health);
                valueDragon.add(armor);
            }else {
               valueDragon.set(0,damage);
               valueDragon.set(1,health);
               valueDragon.set(2, armor);

            }
          nameDragon.put(name,valueDragon);
        }
        dragons.entrySet()
                .stream()
                .forEach(entry ->{
                    double totalDamage = damage(entry.getValue(),0);
                    double totalHealth = damage(entry.getValue(),1);
                    double totalArmor = damage(entry.getValue(),2);
                    System.out.printf("%s::(%.2f/%.2f/%.2f)%n", entry.getKey(),totalDamage,totalHealth,totalArmor);
                    entry.getValue().entrySet().stream()
                            .forEach(e -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                                    e.getKey(),e.getValue().get(0),e.getValue().get(1), e.getValue().get(2)));

                });
    }

    private static double damage(Map<String, List<Integer>> value, int i) {
        double damage = 0;
        for (Map.Entry<String, List<Integer>> entry : value.entrySet()) {
            damage += entry.getValue().get(i);
        }
        return damage/value.size();
    }
}
