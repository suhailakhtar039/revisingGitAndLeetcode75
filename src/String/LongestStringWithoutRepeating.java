package String;

import java.util.HashMap;
import java.util.Map;

public class LongestStringWithoutRepeating {
    public static void solve(){
        String s = "pwwkew";

        Map<Character, Integer> m = new HashMap<>();
        int i = 0, j = 0, n = s.length(), ans = Integer.MIN_VALUE;
        while(i<n){
            if(m.containsKey(s.charAt(i))){
                j = Math.max(j, m.get(s.charAt(i))+1);
            }
            m.put(s.charAt(i),i);
            ans = Math.max(ans, i-j+1);
            i++;
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        solve();
    }
}
