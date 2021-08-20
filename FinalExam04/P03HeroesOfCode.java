package FinalExam04;

import java.util.*;

public class P03HeroesOfCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfHero = Integer.parseInt(scanner.nextLine());
        Map<String,Integer> manaHero = new HashMap<>();
        Map<String, Integer> healHero = new TreeMap<>();

        for (int i = 0; i < numberOfHero; i++) {

            String[] input = scanner.nextLine().split(" ");

            String hero = input[0];
            int hp = Integer.parseInt(input[1]);
            int mana = Integer.parseInt(input[2]);

            if (hp <= 100){
            healHero.put(hero,hp);

            }

            if (mana <= 200){

            manaHero.put(hero,mana);
            }

        }
        String command = scanner.nextLine();

        while (!command.equals("End")){
            String currentCommand = command.split(" - ")[0];

            switch (currentCommand){
                case "CastSpell":
                    //CastSpell – {hero name} – {MP needed} – {spell name}
                    String heroName = command.split(" - ")[1];
                    int mpNeed = Integer.parseInt(command.split(" - ")[2]);
                    String spellName = command.split(" - ")[3];
                    if (manaHero.get(heroName) >= mpNeed){
                        manaHero.put(heroName, manaHero.get(heroName) - mpNeed);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                                heroName,spellName, manaHero.get(heroName));

                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    //{hero name} – {damage} – {attacker}
                    String heroNameDamage = command.split(" - ")[1];
                    int damage = Integer.parseInt(command.split(" - ")[2]);
                    String attackerName = command.split(" - ")[3];

                    int currentHeal = healHero.get(heroNameDamage) - damage;
                    if (currentHeal > 0){
                    healHero.put(heroNameDamage,currentHeal);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                                heroNameDamage,damage,attackerName,currentHeal);

                    }else {
                        System.out.printf("%s has been killed by %s!%n", heroNameDamage,attackerName);
                        healHero.remove(heroNameDamage);
                        manaHero.remove(heroNameDamage);

                    }
                    break;
                case "Recharge":
                   // – {hero name} – {amount}
                    String heroNameRecharge = command.split(" - ")[1];
                    int amount = Integer.parseInt(command.split(" - ")[2]);

                    int currentMana = amount + manaHero.get(heroNameRecharge);
                    if (currentMana > 200){
                        manaHero.put(heroNameRecharge,200);
                        amount = amount - (currentMana - 200);
                    }else {
                        manaHero.put(heroNameRecharge, currentMana);
                    }
                        System.out.printf("%s recharged for %d MP!%n", heroNameRecharge, amount);
                    break;
                case "Heal":
                    String heroNameHealth = command.split(" - ")[1];
                    int health = Integer.parseInt(command.split(" - ")[2]);

                    int currentHealth = health + healHero.get(heroNameHealth);
                    if (currentHealth > 100){
                        healHero.put(heroNameHealth,100);
                        health = health - (currentHealth - 100);
                    }else {
                        healHero.put(heroNameHealth, currentHealth);
                    }
                    System.out.printf("%s healed for %d HP!%n", heroNameHealth, health);
                    break;
            }
            command = scanner.nextLine();

        }
        healHero.entrySet()
                .stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .map(entry -> entry.getKey()+ "\n"+ "  HP: " + entry.getValue() + "\n" +
                        "  MP: "+manaHero.get(entry.getKey()))
                .forEach(System.out::println);

    }
}
