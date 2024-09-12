package blind75;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
           return IntStream.of(nums)
                   .anyMatch(num -> !seen.add(num));
    }
}
