package blind75;

import java.util.*;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> groupAnagramMap = new HashMap<>();
        Arrays.stream(strs).forEach(currentString -> putStringInGroupAnagram(currentString, groupAnagramMap));
        return groupAnagramMap.values().stream().toList();
    }

    private static void putStringInGroupAnagram(String currentString, Map<String, List<String>> groupAnagramMap) {
        String sortedWord = sort(currentString);
        if(!groupAnagramMap.containsKey(sortedWord))
            groupAnagramMap.put(sortedWord,new ArrayList<>());
        groupAnagramMap.get(sortedWord).add(currentString);
    }

    public static String sort(String s){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }
}
