import java.util.Arrays;

public class q2419 {
    public static void main(String[] args) {

    }

    static int longestSubarray(int[] nums) {
        int ret = 0;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int j = 0;
        while (j < nums.length) {
            if (nums[j] == max) {
                int cnt = 0;
                while (j < nums.length && nums[j] == max) {
                    cnt++;
                    j++;
                }
                ret = Math.max(ret, cnt);
            } else {
                j++;
            }
        }
        return ret;
    }
}
