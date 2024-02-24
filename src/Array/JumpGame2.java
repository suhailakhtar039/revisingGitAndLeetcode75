package Array;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};

        int n = nums.length;
        int curFar = 0, curTrigger = 0, ans = 0;
        for(int i = 0; i < n-1; i++){
            curFar = Math.max(curFar, i+ nums[i]);
            if(i == curTrigger){
                ans++;
                curTrigger = curFar;
            }
        }
        System.out.println(ans);
    }
}
