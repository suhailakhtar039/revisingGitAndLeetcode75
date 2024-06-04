package Array;

import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3,3};
        int[] nums2 = {1,1,2,2};

        int n = nums1.length, m = nums2.length;

        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        Map<Integer, Boolean> map = new HashMap<>();
        for(int i:nums2){
            map.put(i, true);
        }
        for(int i = 0; i<n; i++){
            if(!map.containsKey(nums1[i])){
                ans.get(0).add(nums1[i]);
            }
        }
        map.clear();
        for(int i:nums1){
            map.put(i, true);
        }
        for(int i = 0; i<m; i++){
            if(!map.containsKey(nums2[i])){
                ans.get(1).add(nums2[i]);
            }
        }

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        int idx = 0;
        for(List<Integer> l: ans){
            set.addAll(l);
            for(int i:set){
                res.get(idx).add(i);
            }
            set.clear();
            idx++;
        }

        System.out.println(res);
    }
}
