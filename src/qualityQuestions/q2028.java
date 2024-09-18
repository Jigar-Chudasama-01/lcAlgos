package qualityQuestions;

import java.util.Arrays;

public class q2028 {
    public static void main(String[] args) {

    }

    static int[] missingRolls(int[] r, int m, int n) {
        int[] ret = new int[n];
        int sum = 0;
        for (int num : r) {
            sum += num;
        }
        int requiredSum = m * (r.length + n) - sum;
        //how to give 9 apples to 4 people ? 9/4. give each person 2 apples and give an extra to single person.
        int dist = requiredSum / n;
        if (requiredSum > n*6 || n>requiredSum){
            return new int[0];
        }
        int rem = requiredSum % n;
        Arrays.fill(ret, dist);
        for(int i=0; i<ret.length; i++){
            if (rem>0){
                ret[i]+=1;
                rem--;
            }else{
                break;
            }
        }
        return ret;
    }
}
