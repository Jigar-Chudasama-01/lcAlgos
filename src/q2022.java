import java.util.Arrays;

public class q2022 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int m = 2,n=2;
        System.out.println(Arrays.deepToString(construct2DArray(arr, m, n)));
    }
    static int[][] construct2DArray(int[] o, int m, int n) {
        //if matrix cannot fill values return NULL 2D-ARRAY;
        if(m*n!=o.length){return new int[0][0];}
        int [][] res = new int[m][n];
        int index = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[i][j] = o[index++];
            }
        }
        return res;
    }
}
