import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void solve(){
        int[] nums = {2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        recursive(nums,target,0,0, new ArrayList<>(), ans);
        System.out.println(ans);
    }

    private static void recursive(int[] nums, int target, int i, int sum, List<Integer> temp, List<List<Integer>> ans) {
        if(sum>target)
            return ;
        if(sum == target){
            List<Integer> l = new ArrayList<>(temp);
            ans.add(l);
            return;
        }
        for(int j = i; j<nums.length; j++){
            temp.add(nums[j]);
            recursive(nums,target,j,sum+nums[j],temp,ans);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
