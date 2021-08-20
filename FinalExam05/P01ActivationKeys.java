package FinalExam05;


import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")){
            String command = input.split(">>>")[0];
            switch (command){
                case "Flip":
                    String upperOrLower = input.split(">>>")[1];
                    int startIndex = Integer.parseInt(input.split(">>>")[2]);
                    int endIndex = Integer.parseInt(input.split(">>>")[3]);
                    if (upperOrLower.equals("Upper")){

                        String newKEy = activationKey.substring(startIndex,endIndex).toUpperCase();
                        activationKey.replace(startIndex,endIndex,newKEy);
                        System.out.println(activationKey);

                    }else {
                        String newKEy = activationKey.substring(startIndex,endIndex).toLowerCase();
                        activationKey.replace(startIndex,endIndex,newKEy);
                        System.out.println(activationKey);

                    }
                    break;
                case "Contains":
                    String substring = input.split(">>>")[1];
                    if (activationKey.toString().contains(substring)){
                        System.out.printf("%s contains %s%n", activationKey,substring);
                    }else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Slice":
                    int startSliceIndex = Integer.parseInt(input.split(">>>")[1]);
                    int endSliceIndex = Integer.parseInt(input.split(">>>")[2]);
                    activationKey.replace(startSliceIndex,endSliceIndex,"");
                    System.out.println(activationKey);
                    break;

            }

            input = scanner.nextLine();

        }
        System.out.printf("Your activation key is: %s", activationKey);
    }
}
