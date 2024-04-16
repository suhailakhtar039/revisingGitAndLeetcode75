package String;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        String s = "kkdsFuqUfSDKK";

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
            }
            Character tp = st.peek();
            if(Character.toUpperCase(tp) == s.charAt(i) || tp == Character.toUpperCase(s.charAt(i))){
                if(tp == s.charAt(i)){
                    st.push(s.charAt(i));
                    continue;
                }
                st.pop();
                continue;
            }
            st.push(s.charAt(i));
        }
        while (!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        String ans = sb.toString();
        System.out.println(ans);
    }
}
