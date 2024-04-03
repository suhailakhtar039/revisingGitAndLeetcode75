package Array;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {
    public void rotate(int[] ans, int k) {
        int n = ans.length;
        k = k % n;
        int idx = n-k;
        List<Integer> list = new ArrayList<>();
        while(idx < n)
            list.add(ans[idx++]);
        for(int i = 0; i<n-k; i++)
            list.add(ans[i]);
        Integer[] res = list.toArray(new Integer[list.size()]);

        for(int i = 0; i<n; i++){
            ans[i] = res[i];
        }
    }
}
