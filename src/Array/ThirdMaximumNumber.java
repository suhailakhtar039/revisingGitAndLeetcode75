package Array;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,5,7,1,9,5,6};
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        Integer res = (max3 == null) ? max1 : max3;
        if(max3 == null)
            System.out.println(max1);
        else
            System.out.println(max3);
    }
}
