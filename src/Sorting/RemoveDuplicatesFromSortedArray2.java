package Sorting;

public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0,j=0,k=0;
        while(i<n){
            j=i;
            while(j<n && nums[j]==nums[i])j++;
            if(j-i>=2)
            {
                nums[k++]=nums[i];
                nums[k++]=nums[i];
            }
            else
                nums[k++]=nums[i];
            i=j;
        }
        return k;
    }
}
