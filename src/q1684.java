import java.util.HashSet;
import java.util.Set;

public class q1684 {
    public static void main(String[] args) {

    }
    static int countConsistentStrings(String a, String[] w) {
        Set<Character> r = new HashSet<>();
        int ret = 0;
        for(int i=0; i<a.length(); i++){
            r.add(a.charAt(i));
        }
        for(int i=0; i<w.length; i++){
            boolean c = false;
            for(int j=0; j<w[i].length(); j++){
                if(!r.contains(w[i].charAt(j))){
                    c = true;
                    break;
                }
            }
            if(c){ret++;}
        }
        return ret;
    }
}
