package Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicates {
    public static void main(String[] args) {
        String s = "abbaca";
        String ans = solve(s);
        System.out.println(ans);
    }
    public static String solve(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            if(st.empty())
                st.push(s.charAt(i));
            else{
                if(st.peek() == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder("");
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        String ans = sb.toString();
        return ans;
    }
}
