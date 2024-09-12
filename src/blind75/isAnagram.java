package blind75;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = stringToMap(s);
        Map<Character,Integer> tMap = stringToMap(t);
        return sMap.equals(tMap);
    }

    public static HashMap<Character,Integer> stringToMap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        s.chars().forEach(c -> map.put((char) c,map.getOrDefault((char)c,0)+1));
        return map;
    }
}
