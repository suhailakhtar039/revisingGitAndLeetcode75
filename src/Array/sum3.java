package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sum3 {
    public static void solve(){
        int []nums = {-1, 0, 1, 2, -1, -4};

        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++)
            map.put(nums[i],i);
        for(int i = 0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            for(int j=i+1; j<n-1; j++){
                int key = -(nums[i] + nums[j]);
                if(map.containsKey(key) && map.get(key) > j){
                    int idx = map.get(key);
                    if(idx > j){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(key);
                        ans.add(temp);
                    }
                }
            }
        }


        for(List l: ans){
            for(Object i:l)
                System.out.println(i);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        solve();
    }
}
