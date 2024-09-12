package blind75;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> conjugateMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int neededValue = target - nums[i];
            if(conjugateMap.containsKey(neededValue)) return new int[]{i,conjugateMap.get(neededValue)};
            conjugateMap.put(nums[i],i);
        }
        return null;
    }
}
