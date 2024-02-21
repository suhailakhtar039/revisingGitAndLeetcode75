package Array;


public class NextPermutation {
    public static void main(String[] args) {
        int []nums = {2,4,6,7,6,5,4};
        nextPermutation(nums);
        System.out.println("After");
        for(int i:nums)
            System.out.println(i);
    }

    public static void nextPermutation(int[] nums){
        int n = nums.length;
        int idx = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i+1] > nums[i]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0, n-1);
            return;
        }

        int idx2 = -1;
        for(int i = n-1; i>=0; i--){
            if(nums[i] > nums[idx]){
                idx2 = i;
                break;
            }
        }
        int t = nums[idx];
        nums[idx] = nums[idx2];
        nums[idx2] = t;

        reverse(nums,idx + 1,n-1);
    }
    public static void reverse(int[] nums, int start, int end){
        int st = start, en = end;
        while(st<en){
            int t = nums[st];
            nums[st] = nums[en];
            nums[en] = t;
            st++;en--;
        }
    }
}
