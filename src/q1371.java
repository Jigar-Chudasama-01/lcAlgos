//import java.util.HashMap;
//
//public class q1371 {
//    public static void main(String[] args) {
//
//    }
//
//    static int findTheLongestSubstring(String s) {
//        int ret = 0;
//        HashMap<Character, Integer> r = new HashMap<>();
//        r.put('a', 0);
//        r.put('u', 0);
//        r.put('o', 0);
//        r.put('i', 0);
//        r.put('e', 0);
//
//
//        int i = 0, j = 0;
//
//        while (j < s.length()) {
//            if (s.charAt(j) == 'a' || s.charAt(j) == 'o' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'u') {
//                r.put(s.charAt(j), r.getOrDefault(s.charAt(j), 0) + 1);
//            }
//            while (r.containsKey(s.charAt(j)) && r.get(s.charAt(j)) % 2 == 1) {
//
//            }
//        }
//    }
//}
