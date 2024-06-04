package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2};

        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int n = arr.length;
        boolean ans = true;

        for (int i : arr) {
            if (!map.containsKey(i))
                map.put(i, map.getOrDefault(i, 0) + 1);
            else map.put(i, map.get(i) + 1);
        }
        System.out.println(map);
        for (int i : map.values()) {
            System.out.println("value = " + i);
            if (set.contains(i)) {
                ans = false;
                break;
            }
            set.add(i);
        }
        System.out.println(ans);

    }
}
