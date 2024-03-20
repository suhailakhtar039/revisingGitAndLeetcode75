package Queue;

import java.util.*;

class Frequency{
    int freq;
    int val;
    public Frequency(){}
    public Frequency(int val, int freq){
        this.val = val;
        this.freq = freq;
    }

    @Override
    public String toString() {
        return "Frequency{" +
                "freq=" + freq +
                ", val=" + val +
                '}';
    }
}

public class TopKmostFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int[] ans = new int[k];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i,0)+1);

        PriorityQueue<Frequency> pq = new PriorityQueue<>((a,b)->b.freq-a.freq);
        for(Map.Entry<Integer,Integer> i:map.entrySet())
            pq.add(new Frequency(i.getKey(),i.getValue()));
        System.out.println(map);
        System.out.println(pq);


        int st = 0;
        while(st<k && !pq.isEmpty()){
            ans[st] = pq.poll().val;
            st++;
        }
        // System.out.println(list);
        for(int i:ans)
            System.out.println(i);
    }
}
