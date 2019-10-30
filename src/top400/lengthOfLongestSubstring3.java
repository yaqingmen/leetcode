package top400;
import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(" "));

    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while(j < s.length()) {
            if(!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(set.size(), max);
            }else{
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
//    public static int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0 || s == null) return 0;
//        int maxlen = -1;
//        for(int i = 0; i < s.length(); i++) {
//            Map<Character, Integer> map = new HashMap<>();
//            for(int j = i; j < s.length(); j++) {
//                if(!map.containsKey(s.charAt(j))) {
//                    map.put(s.charAt(j), j);
//                    maxlen = Math.max(map.size(), maxlen);
//                }else {
//                    break;
//                }
//            }
//        }
//        return maxlen;
//}
}
