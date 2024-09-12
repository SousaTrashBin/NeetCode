package blind75;
import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (numsSet.contains(num)) return true;
            numsSet.add(num);
        }
        return false;
    }
}
