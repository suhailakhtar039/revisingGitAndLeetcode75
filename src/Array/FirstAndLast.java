package Array;

public class FirstAndLast {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int n = nums.length;
        // first
        int idx = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] >= target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        ans[0] = idx;

        //second
        idx = -1;
        start = 0;
        end = n-1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] <= target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            if(nums[mid] == target) idx = mid;
        }
        ans[1] = idx;
        return ans;
    }
}
