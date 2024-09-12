package blind75;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> seen = setFromArray(nums);
        int maxStreak = 0;
        for (int num : nums){
            int currentStreak = 0;
            while(seen.contains(num) && !seen.contains(num+1)){
                currentStreak++;
                seen.remove(num);
                num--;
            }
            maxStreak = Math.max(currentStreak, maxStreak);
        }
        return maxStreak;
    }

    private static Set<Integer> setFromArray(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) seen.add(num);
        return seen;
    }

}
