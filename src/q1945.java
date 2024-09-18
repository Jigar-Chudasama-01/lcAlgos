public class q1945 {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode",2));
    }
    static int getLucky(String s, int k) {
        int res = 0;
        for(int i=0; i<s.length(); i++){
            res = res + tf(s.charAt(i)-'a'+1);
        }
        while(k!=1){
            res = tf(res);
            k--;
        }
        return res;
    }
    static int tf(int num){
        int res = 0;
        while (num!=0){
            res += num %10;
            num /=10;
        }
        return res;
    }
}
