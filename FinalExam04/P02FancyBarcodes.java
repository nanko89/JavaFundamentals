package FinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "[@][#]+(?<product>[A-Z][A-Za-z0-9]{4,}[A-Z])[@][#]+";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String product = matcher.group("product");
                String number = "";
                String regexNum = "(?<num>[\\d]+)";
                Pattern pattern1 = Pattern.compile(regexNum);
                Matcher matcher1 = pattern1.matcher(product);
                boolean notFind = true;
                while (matcher1.find()) {
                    notFind =false;
                    number += matcher1.group("num");
                }
                if(notFind){
                    number = "00";
                }
                System.out.println("Product group: " + number);
            }else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
