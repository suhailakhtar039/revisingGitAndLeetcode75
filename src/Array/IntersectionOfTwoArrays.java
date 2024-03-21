package Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums1)
            map.put(i, map.getOrDefault(i,0)+1);
        // System.out.println(map);
        for(int i=0; i<nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        // System.out.println(map);
        // System.out.println(list);
        int sz = list.size();
        int[] res = new int[sz];
        for(int i = 0; i<sz; i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
