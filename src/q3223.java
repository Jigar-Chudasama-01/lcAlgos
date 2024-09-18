public class q3223 {
    static int minimumLength(String s) {
        int [] f = new int[26];
        int ret = 0;
        for(int i=0; i<s.length(); i++){
            f[s.charAt(i)-'a']++;
        }
        for(int i=0; i<f.length;i++){
            if(f[i]!=0 && f[i]%2==0){
                ret+=2;
            }else if(f[i]!=0){
                ret+=1;
            }
        }
        return ret;
    }
}