package Stack;

public class RemoveOutermostParantheses {
    public static void main(String[] args) {
        String s = "()()((()))";
        String ans = solve(s);
        System.out.println(ans);
    }
    public static String solve(String s){
        int open = 0, close = 0, start = 0;
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(')
                open++;
            else
                close++;

            if(open == close){
                sb.append(s.substring(start+1, i));
                start = i+1;
            }
        }
        return sb.toString();
    }
}
