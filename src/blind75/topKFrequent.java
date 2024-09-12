package blind75;

import aux.Pair;

import java.util.*;

public class topKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int num : nums)
            frequencyMap.put(num, frequencyMap.getOrDefault(num,0) + 1);
        return frequencyMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
