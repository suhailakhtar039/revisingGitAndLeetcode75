package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5};
        int[] nums2 = {1,2,3,4,5};
        int[] ans = nextGreaterElement(nums1, nums2);
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[m];
        Stack<Integer> stk = new Stack<>();
        ans[m-1] = -1;
        stk.push(nums2[m-1]);
        for(int i = m-2; i>=0; i--){
            while(!stk.isEmpty() && nums2[i] > stk.peek()){
                stk.pop();
            }
            ans[i] = stk.isEmpty()?-1:stk.peek();
            stk.push(nums2[i]);
        }
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i = 0; i<m; i++)
            res.put(nums2[i],ans[i]);
        int[] show = new int[n];
        for(int i = 0; i<n; i++)
            show[i] = res.get(nums1[i]);
        return show;
    }
}
