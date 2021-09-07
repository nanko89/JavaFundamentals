import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder word = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            String[] data = input.split(" ");
            switch (data[0]){
                case "Change":
                    String oldChar = data[1];
                    String newChar = data[2];
                    while (word.toString().contains(oldChar)) {
                        word = new StringBuilder(word.toString().replace(oldChar, newChar));
                    }
                    System.out.println(word);
                    break;
                case "Includes":
                    String includes = data[1];
                    if (word.toString().contains(includes)){
                        System.out.println("True");
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endString = data[1];
                    if (word.toString().contains(endString)){
                       int indexOf = word.indexOf(endString);
                       if (indexOf + endString.length() == word.length()){
                           System.out.println("True");
                       }else {
                           System.out.println("False");
                       }
                    }else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    word = new StringBuilder(word.toString().toUpperCase());
                    System.out.println(word);
                    break;
                case "FindIndex":
                    String indexOfChar = data[1];
                    int index = word.indexOf(indexOfChar);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int length = Integer.parseInt(data[2]);
                    word = new StringBuilder(word.substring(startIndex,startIndex + length));
                    System.out.println(word);
                    break;
            }

            input = scanner.nextLine();

        }

    }
}
