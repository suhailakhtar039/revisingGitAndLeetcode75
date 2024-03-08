package Stack;

import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {

    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i<n; i++)
            ans[i] = nums[i];
        for(int i = n,j = 0; i<2*n && j<n; j++, i++)
            ans[i] = nums[j];
        // System.out.println("circular");
        // for(int i:ans)
        //     System.out.print(i + " ");
        // System.out.println();

        int[] res = new int[2*n];
        res[2*n-1] = -1;
        stk.push(ans[2*n-1]);
        for(int i = 2*n-2; i>=0; i--){
            while(!stk.isEmpty() && ans[i] >= stk.peek()){
                stk.pop();
            }
            res[i] = stk.isEmpty()?-1:stk.peek();
            stk.push(ans[i]);
        }

        // System.out.println("result");
        // for(int j:res)
        //     System.out.print(j + " ");
        // System.out.println();
        int[] temp = new int[n];
        for(int i = 0; i < n; i++)
            temp[i] = res[i];
        return temp;
    }

}
