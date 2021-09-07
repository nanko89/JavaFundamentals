import java.util.Scanner;

public class P01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	0-2 – baby;
        //•	3-13 – child;
        //•	14-19 – teenager;
        //•	20-65 – adult;
        //•	>=66 – elder;
        //•	All the values are inclusive.

        int age = Integer.parseInt(scanner.nextLine());
        if (0 <= age && age <= 2){
            System.out.println("baby");
        }else if (3 <= age && age <= 13){
            System.out.println("child");
        }else if (14 <= age && age <= 19){
            System.out.println("teenager");
        }else if (20 <= age && age <= 65){
            System.out.println("adult");
        }else if (age >= 66){
            System.out.println("elder");
        }
    }
}
