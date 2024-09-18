import java.util.ArrayList;
import java.util.HashMap;

public class q884 {
    public static void main(String[] args) {

    }

    static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> r = new HashMap<>();
        HashMap<String, Integer> r1 = new HashMap<>();
        ArrayList<String> ret = new ArrayList<>();

        for (String s : s1.split(" ")) {
            r.put(s, r.getOrDefault(s, 0) + 1);
        }
        for (String s : s2.split(" ")) {
            r1.put(s, r1.getOrDefault(s, 0) + 1);
        }
        for (String str : s1.split(" ")) {
            if (r.get(str) == 1 && !r1.containsKey(str)) {
                ret.add(str);
            }
        }
        for (String str : s2.split(" ")) {
            if (r1.get(str) == 1 && !r.containsKey(str)) {
                ret.add(str);
            }
        }
        int index = 0;
        String[] arr = new String[ret.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[index++] = ret.get(i);
        }
        return arr;
    }
}
