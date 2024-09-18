public class q2220 {
    public static void main(String[] args) {

    }

    static int minBitFlips(int start, int goal) {
        int cnt = 0;
        while (goal!=0 || start!=0){
            if ((start&1)!=(goal&1)){
                cnt ++;
            }
            goal = goal>>1;
            start = start>>1;
        }
        return cnt;
    }
}
