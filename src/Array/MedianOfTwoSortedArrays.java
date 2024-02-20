package Array;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

    }
    public static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int n = nums1.length,m = nums2.length;
        if(m<n)
            return findMedianSortedArrays(nums2, nums1);
        int left = 0, right = n;
        int size = (n+m+1)/2;
        int mid = (left + right)/2;
        while(left <= right){
            mid = (left + right)/2;
            int left1size = mid;
            int left2size = size - left1size;

            int left1 = Integer.MIN_VALUE, left2 = Integer.MIN_VALUE, right1 = Integer.MAX_VALUE, right2 = Integer.MAX_VALUE;

            if(left1size > 0)
                left1 = nums1[left1size-1];
            if(left2size > 0)
                left2 = nums2[left2size-1];

            if(left1size < n)
                right1 = nums1[left1size];
            if(left2size < m)
                right2 = nums2[left2size];
            if(left1 <= right2 && left2 <= right1){
                boolean even = ((n+m)%2 == 0);
                if(even)
                    return (Integer.max(left1,left2) + Integer.min(right1, right2))/2.0;
                else
                    return Integer.max(left1,left2);
            }
            else if(left1 > right2)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return 1.0;
    }
}
