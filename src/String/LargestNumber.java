package String;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public static void main(String[] args) {

    }
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] s_num = new String[n];
        for (int i = 0; i < n; i++) {
            s_num[i] = String.valueOf(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = String.valueOf(a) + String.valueOf(b);
                String ba = String.valueOf(b) + String.valueOf(a);
                return ba.compareTo(ab);
            }
        };

        Arrays.sort(s_num, comp);
        if (s_num[0].charAt(0) == '0') {
            return "0";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(s_num[i]);
        }
        return sb.toString();
    }
}
