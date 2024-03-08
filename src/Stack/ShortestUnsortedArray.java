package Stack;

public class ShortestUnsortedArray {
    public static void main(String[] args) {

    }
    public static int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int st = 0, en = -1, max = nums[0], min = nums[n-1];
        for(int i = 1; i<n; i++){
            if(max > nums[i]){
                en = i;
            }else
                max = nums[i];
        }

        for(int i = n-2; i>=0; i--){
            if(min < nums[i])
                st = i;
            else
                min = nums[i];
        }
        return en-st+1;
    }
}
