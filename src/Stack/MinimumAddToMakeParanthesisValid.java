package Stack;

import java.util.Stack;

public class MinimumAddToMakeParanthesisValid {
    public static void main(String[] args) {
        String s = "(())))))";
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                st.push('(');
            }else{
                if(st.isEmpty())
                    st.push(')');
                else{
                    char top = st.peek();
                    if(top == '(')
                        st.pop();
                    else
                        st.push(s.charAt(i));
                }
            }
        }
        System.out.println(st.size());
    }
}
