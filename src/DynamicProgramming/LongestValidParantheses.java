package DynamicProgramming;

import java.util.Stack;

public class LongestValidParantheses {
    public static void main(String[] args) {
        String s = "(())))(";
        int ans = longestValidParentheses(s);
    }
    public static int longestValidParentheses(String s) {
        int ans = 0, n = s.length();
        int left = 0, right = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '(')left++;
            else right++;
            if(left == right)
                ans = Math.max(ans, 2*left);
            if(right > left){
                left = right = 0;
            }
        }
        left = right = 0;
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) == ')')right++;
            else left++;
            if(left == right)
                ans = Math.max(ans, 2*right);
            if(left > right){
                left = right = 0;
            }
        }
        return ans;
    }

    public static int usingStack(String str){
        int n = str.length();

        // Create a stack and push -1
        // as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        // Initialize result
        int result = 0;

        // Traverse all characters of given string
        for (int i = 0; i < n; i++)
        {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
                stk.push(i);

                // // If closing bracket, i.e.,str[i] = ')'
            else
            {
                // Pop the previous
                // opening bracket's index
                if(!stk.empty())
                    stk.pop();

                // Check if this length
                // formed with base of
                // current valid substring
                // is more than max
                // so far
                if (!stk.empty())
                    result
                            = Math.max(result,
                            i - stk.peek());

                    // If stack is empty. push
                    // current index as base
                    // for next valid substring (if any)
                else
                    stk.push(i);

                Stack<Integer> temp = stk;
            }
        }

        return result;
    }
}
