//package qualityQuestions;
//
//import java.util.Arrays;
//
//public class q746 {
//    static int dp[];
//
//    public static void main(String[] args) {
//
//    }
//
//    public static int minCostClimbingStairs(int[] cost) {
//        int[] a1 = new int[cost.length - 1];
//        int[] a2 = new int[cost.length - 1];
//        int index = 0;
//        for (int i = 0; i < cost.length; i++) {
//            if (i != cost.length - 1) {
//                a1[i] = cost[i];
//            }
//            if (i != 0) {
//                a2[index++] = cost[i];
//            }
//        }
//        int a= help(a1);
//        int b= help(a2);
//        return Math.min(a,b);
//    }
//
//    public static int help(int[] arr) {
//        int[] dp = new int[arr.length];
//        for (int i = 0; i < dp.length; i++) {
//            int one = arr[i];
//            if (i - 1 > 0) {
//                one += dp[i - 1];
//            }
//            int two = arr[i];
//            if (i - 2 > 0) {
//                two += dp[i - 2];
//            }
//            dp[i] = Math.min(one, two);
//        }
//        return dp[arr.length-1];
//    }
//    /*
//     * int neg = 0;
//     * int [] dp = new int[n];
//     * for(int i=0; i<dp.length; i++)
//     * {
//     *   int one = arr[i]; if(i-1>0){one+=dp[i-1];}
//     *   int two = arr[i]; if(i-2>0){two+=dp[i-2];}
//     *   dp[i] = Math.min(one,two);
//     * }
//     * return dp[n-1];
//     * */
//}
