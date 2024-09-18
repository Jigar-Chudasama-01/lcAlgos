public class q2109 {
    public static void main(String[] args) {

    }
    static String addSpaces(String s, int[] spaces) {
        int index = 0;
        //string builder obj is mutable, it appends chars to same sb object, while in string, each addition of char, a new string obj is created;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(index<spaces.length && i==spaces[index]){
                sb.append(" ");
                index++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}