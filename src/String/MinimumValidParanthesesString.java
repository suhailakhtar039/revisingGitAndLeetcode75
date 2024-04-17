package String;

import java.util.Stack;

public class MinimumValidParanthesesString {
    public static void main(String[] args) {
        String s = "))()()((";

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i< s.length(); i++) {
            if(sb.charAt(i) == '('){
                st.push(i);
            }
            else if(sb.charAt(i) == ')'){
                if(!st.isEmpty()) st.pop();
                else sb.setCharAt(i, '*');
            }
        }
        while (!st.empty())
            sb.setCharAt(st.pop(), '*');

        System.out.println(sb.toString().replaceAll("\\*", ""));

    }
}
