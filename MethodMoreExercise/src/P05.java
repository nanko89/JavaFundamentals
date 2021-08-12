import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        PrintResult(first, second, third);

    }

    private static void PrintResult(int num1, int num2, int num3)
    {
        if (IsZero(num1, num2, num3))
        {
            System.out.println("zero");
        }
        else if (IsNegative(num1, num2, num3))
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("positive");
        }
    }
    private static boolean IsZero(int num1, int num2, int num3)
    {
        if (num1 == 0 ||
                num2 == 0 ||
                num3 == 0)
        {
            return true;
        }
        return false;
    }

    private static boolean IsNegative(int num1, int num2, int num3)
    {
        int[] numbers = new int[] { num1, num2, num3 };
        int counter = 0;
        for (int i = 0; i < 3; i++)
        {
            if (numbers[i] < 0)
            {
                counter++;
            }
        }
        if (counter % 2 == 0)
        {
            return false;
        }
        return true;
    }
}

