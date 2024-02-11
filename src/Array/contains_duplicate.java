package Array;

import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    public static void main(String args[]){
        solve();
    }

    private static Boolean solve() {
        int []nums= {4,2,8,7,5,4};
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(s.contains(nums[i]))
                return true;
            s.add(nums[i]);
        }
        return false;
    }
}
