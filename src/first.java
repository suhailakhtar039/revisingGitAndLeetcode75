import java.util.HashMap;
import java.util.Map;

public class first {
    public static void solve(){
        int target = 9;
        int[] ans = {-1, -1};
        int[] nums = {3,4,1,2,5,8,0};
        Map<Integer, Integer> keep_count = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int b= target - nums[i];
            if(keep_count.containsKey(b)){
                nums[0] = i;
                nums[1] = keep_count.get(b);
            }
            keep_count.put(nums[i],i);
        }
        for(int i = 0; i < 2; i++)
            System.out.println(nums[i]);
    }
    public static void main(String[] args) {
        solve();
    }
}
