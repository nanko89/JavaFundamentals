package FinalExam04;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine()); //count of heroes
        //1 ЧАСТ: ДАННИ ЗА ГЕРОЯ

        //герои(текст) -> mp(цяло число)
        Map<String, Integer> heroesMP = new TreeMap<>();

        //герои(текст) -> hp(цяло число)
        Map<String, Integer> heroesHP = new TreeMap<>();

        for (int hero = 1; hero <= n; hero++) {
            String data = scanner.nextLine();//"Solmyr 85 120"
            String[] splitData = data.split("\\s+"); // ["Solmyr", "85", "120"]
            String heroName = splitData[0];
            int hp = Integer.parseInt(splitData[1]);
            int mp = Integer.parseInt(splitData[2]);

            //max hp e 100
            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }

            //map mp e 200
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }


        //2. КОМАНДИ
        String command = scanner.nextLine();
        //"CastSpell – {hero name} – {MP needed} – {spell name}" -> ["CastSpell", "{hero name}", "{MP needed}", "{spell name}"]
        //"TakeDamage – {hero name} – {damage} – {attacker}" ->     ["TakeDamage", "{hero name}", "{damage}", "{attacker}"]
        //"Recharge – {hero name} – {amount}" ->                    ["Recharge", "{hero name}", "{amount}"]
        //"Heal – {hero name} – {amount}" ->                        ["Heal", "{hero name}", "{amount}"]
        while(!command.equals("End")) {
            String [] commandParams = command.split(" - ");
            String commandName = commandParams[0];//"CastSpell", "TakeDamage", "Recharge", "Heal"
            String heroName = commandParams[1];
            switch(commandName) {
                case "CastSpell":
                    int mpNeeded = Integer.parseInt(commandParams[2]);
                    String spellName = commandParams[3];
                    int currentMp = heroesMP.get(heroName);
                    //изпълняваме магията
                    if(currentMp >= mpNeeded) {
                        int mpLeft = currentMp - mpNeeded;
                        heroesMP.put(heroName, mpLeft);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpLeft);
                    }
                    //ако не я изпълняваме
                    else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commandParams[2]);
                    String attacker = commandParams[3];
                    int currentHp = heroesHP.get(heroName);
                    int leftHp = currentHp - damage;
                    //жив
                    if(leftHp > 0) {
                        heroesHP.put(heroName, leftHp);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, leftHp);
                    }
                    //умрял
                    else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge": //increase mp
                    int amountRecharge = Integer.parseInt(commandParams[2]);
                    int currentMpForRecharge = heroesMP.get(heroName);
                    int increaseMP = currentMpForRecharge + amountRecharge;
                    if(increaseMP > 200) {
                        increaseMP = 200;
                    }
                    heroesMP.put(heroName, increaseMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increaseMP - currentMpForRecharge);
                    break;
                case "Heal":
                    int amountHeal = Integer.parseInt(commandParams[2]);
                    int currentHPForHeal = heroesHP.get(heroName);
                    int increasedHP = currentHPForHeal + amountHeal;
                    if(increasedHP > 100) {
                        increasedHP = 100;
                    }
                    heroesHP.put(heroName, increasedHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, increasedHP - currentHPForHeal);
                    break;
            }
            command = scanner.nextLine();
        }

        heroesHP.entrySet().stream()
                //име на героя -> hp
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(heroEntry -> {
                    String heroName = heroEntry.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + heroEntry.getValue());
                    System.out.println("  MP: " + heroesMP.get(heroName));
                });
    }
}
