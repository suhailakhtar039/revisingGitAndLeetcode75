package String;

import java.util.*;

public class GroupAnagram {
    public static void solve(){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        int n = strs.length;

        List<String> l = new ArrayList<>();
        for(int i = 0; i<n; i++)
            l.add(strs[i]);
        String[] temp = strs;
        // temp = strs;
        for(int i = 0; i < n; i++){
            char[] c = temp[i].toCharArray();
            Arrays.sort(c);
            String a = new String(c);
            temp[i] = a;
        }
        Map<String, List<Integer>> m = new HashMap<>();
        int i = 0;
        while(i < n){
            if(!m.containsKey(temp[i])){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                m.put(temp[i], list);
            }
            else{
                m.get(temp[i]).add(i);
            }
            i++;
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<Integer>> c: m.entrySet()){
            List<String> l1 = new ArrayList<>();
            for(int k: c.getValue())
                l1.add(l.get(k));
            ans.add(l1);
            // System.out.println("key = " + c.getKey() + " value = " + c.getValue());
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve();
    }
}
