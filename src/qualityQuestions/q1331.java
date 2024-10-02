package qualityQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class q1331 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayRankTransform(new int[]{37, 12, 28, 9, 100, 56, 80, 5, 12})));
    }

    static int[] arrayRankTransform(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        int rank = 1;
        HashMap<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && copy[i] > copy[i - 1]) {
                rank++;
            }
            r.put(copy[i], rank);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.get(arr[i]);
        }
        return arr;
    }
}
