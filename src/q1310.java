public class q1310 {
    public static void main(String[] args) {

    }
    static int[] xorQueries(int[] arr, int[][] q) {
        int [] prefix = new int[arr.length];
        int [] ret = new int[q.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1]^arr[i];
        }
        for(int i=0; i<q.length; i++){
            if(q[i][0]==0){
                ret[i] = prefix[q[i][1]];
            }
            else{
                ret[i] = prefix[q[i][1]]^prefix[q[i][0]-1];
            }
        }
        return ret;
    }
}
