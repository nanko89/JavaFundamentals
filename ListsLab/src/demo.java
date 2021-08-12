import java.util.List;
import java.util.stream.Collectors;

public class demo {
    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());
    }

}
