package Array;

import java.util.HashMap;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        while(true){
            map.put(n, true);
            int d = n;
            int sum = 0;
            while(d > 0){
                int rem = d%10;
                sum += rem*rem;
                d /= 10;
            }
            n = sum;
            // System.out.println(n);
            if(n == 1)
                return true;
            if(map.containsKey(n))
                return false;
        }
    }
}
