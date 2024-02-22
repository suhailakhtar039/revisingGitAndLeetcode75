package Array;

public class SearchInsert {
    public static void main(String[] args) {

    }
    public int searchInsert(int[] nums, int target) {
        int a = index(nums,target);
        return a;
    }

    public static int index(int[] nums, int target){
        int n = nums.length;
        if(target < nums[0])
            return 0;
        if(target > nums[n-1])
            return n;
        int st = 0, en = n-1,mid;
        mid = (st+en)/2;
        while(st <= en){
            mid = (st + en)>>1;
            if(nums[mid] == target)return mid;
            else if(target > nums[mid])
                st = mid+1;
            else
                en = mid-1;
        }
        return (st + en)/2+1;
    }
}
