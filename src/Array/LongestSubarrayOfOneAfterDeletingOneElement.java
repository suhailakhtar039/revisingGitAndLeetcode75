package Array;

public class LongestSubarrayOfOneAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};


        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int ans = 0;
        if (n == 1) {
            ans = 0;
            System.exit(-1);
        }
        prefix[0] = nums[0] == 0 ? 0 : 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == 0)
                prefix[i] = 0;
            else
                prefix[i] = nums[i] + prefix[i - 1];
        }
        suffix[n - 1] = nums[n - 1] == 0 ? 0 : 1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] == 0)
                suffix[i] = 0;
            else
                suffix[i] = nums[i] + suffix[i + 1];
        }
        // main logic starts from here
        for (int i = 0; i < n; i++) {
            int noOfOne;
            if (i == 0) {
                noOfOne = suffix[i + 1];
            } else if (i == n - 1) {
                noOfOne = prefix[i - 1];
            } else {
                noOfOne = prefix[i - 1] + suffix[i + 1];
            }
            ans = Math.max(ans, noOfOne);
        }
        System.out.println("ans = " + ans);
        System.out.println("actual array");
        for (int i : nums)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("prefix array");
        for (int i : prefix)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("suffix array");
        for (int i : suffix)
            System.out.print(i + " ");
        System.out.println();

    }
}
