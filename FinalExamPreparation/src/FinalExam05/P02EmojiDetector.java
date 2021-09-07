package FinalExam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String > emoji = new ArrayList<>();

        String regexEmoji = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regexEmoji);
        Matcher matcher = pattern.matcher(input);

        String regexCoolThreshold = "[\\d]";
        Pattern pattern1 = Pattern.compile(regexCoolThreshold);
        Matcher matcher1 = pattern1.matcher(input);
        int coolThreshold = 1;
        int countEmoji = 0;
        while (matcher1.find()){
            int num = Integer.parseInt(matcher1.group());
            coolThreshold *= num;
        }

        while (matcher.find()){
            countEmoji ++;
            String currentEmoji = matcher.group();
        String word = matcher.group("emoji");
        int sumChar = 0;
            for (int i = 0; i < word.length(); i++) {
                char current = word.charAt(i);
                sumChar += current;
            }
            if (sumChar > coolThreshold){
              emoji.add(currentEmoji);
            }
        }
        if (countEmoji > 0) {
            System.out.printf("Cool threshold: %d%n", coolThreshold);
            System.out.printf("%d emojis found in the text. The cool ones are:%n", countEmoji);
            emoji.forEach(System.out::println);
        }
    }
}
