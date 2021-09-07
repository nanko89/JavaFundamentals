package FinalExam03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> findWord = new ArrayList<>();
        String input = scanner.nextLine();
        String regex = "([@#])(?<first>[A-Za-z]{3,})\\1\\1(?<second>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        boolean isFindMirrorWords = false;
        int count = 0;
        String result;
        if (matcher.find()){
            count++;
            String firstWord = matcher.group("first");
            StringBuilder secondWord = new StringBuilder(matcher.group("second"));
            String mirrorWord = secondWord.reverse().toString();
            if (firstWord.equals(mirrorWord)){
                isFindMirrorWords = true;
                result = firstWord+ " <=> " + secondWord.reverse();
                findWord.add(result);
            }
        }else {
            System.out.println("No word pairs found!");
        }

        while (matcher.find()){
            count++;
            String firstWord = matcher.group("first");
            StringBuilder secondWord = new StringBuilder(matcher.group("second"));
            String mirrorWord = secondWord.reverse().toString();
            if (firstWord.equals(mirrorWord)){
                result = firstWord+ " <=> " + secondWord.reverse();
                findWord.add(result);
            }
        }
        if (count > 0) {
            System.out.printf("%d word pairs found!%n", count);
        }
        if (!isFindMirrorWords && findWord.isEmpty()){
            System.out.println("No mirror words!");
        }
    if (!findWord.isEmpty()){
        System.out.println("The mirror words are:");
        System.out.println( String.join(", ", findWord));
    }
    }
}
