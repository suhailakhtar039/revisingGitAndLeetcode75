package Array;

public class MoveAllZero {
    public static void main(String[] args) {
        int[] nums = {2, 0, 1, 0, 3, 12};

        int n = nums.length;
        int j = 0, i = 0;
        for (; i < n; i++) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                j++;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
