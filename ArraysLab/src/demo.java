import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        Arrays.stream(array).forEach(System.out::println);
    }
}
