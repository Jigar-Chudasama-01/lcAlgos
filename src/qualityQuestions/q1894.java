package qualityQuestions;

public class q1894 {
    public static void main(String[] args) {

    }
    static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i:chalk){
            sum +=i;
            if (sum>k){
                break;
            }
        }
        k = k % (int)sum;
        for(int i=0; i<chalk.length; i++){
            if(k<chalk[i]){
                return i;
            }
            k = k - chalk[i];
        }
        return 0;
    }
}