package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        String s = "reet";
        String ans = solve(s);
        System.out.println(ans);

    }
    public static String solve(String s){
        Map<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray()){
            if(m.containsKey(c)){
                int cnt = m.get(c);
                m.put(c,cnt+1);
            }else{
                m.put(c,1);
            }
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
        pq.addAll(m.entrySet());

        StringBuilder stringBuilder = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> e = pq.poll();
            for(int i =0; i<e.getValue(); i++)
                stringBuilder.append(e.getKey());
        }
        return stringBuilder.toString();
    }
}
