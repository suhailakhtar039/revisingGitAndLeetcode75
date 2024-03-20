package Sorting;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {2,3,5,6,0,0};
        int[] nums2 = {4,5};
        int m = nums1.length, n = nums2.length;
        int i = m-1, j = n-1, k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            }
            else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }
        while(i>=0){
            nums1[k--] = nums1[i--];
        }
        while(j>=0)
            nums1[k--] = nums2[j--];
    }
}
