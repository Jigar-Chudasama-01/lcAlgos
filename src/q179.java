//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.Map;
//
//public class q179 {
//    public static void main(String[] args) {
//
//    }
//
//    static String largestNumber(int[] nums) {
//        HashMap<Integer,Integer> r = new HashMap<>();
//
//        for(int i=0; i<nums.length; i++){
//            r.put(nums[i],count(num[i]));
//        }
//
//
//
//
//    }
//
//    static int count(int num) {
//        int cnt = 0;
//        while (num != 0) {
//            cnt++;
//            num /= 10;
//        }
//        return cnt;
//    }
//
//}
//
//class comp implements Comparator<Map.Entry<Integer, Integer>> {
//
//    @Override
//    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//        if (o1.getValue() < o2.getValue()) {
//            return o1.getKey() - o2.getKey();
//        }
//        return o2.getValue() - o1.getValue();
//    }
//}