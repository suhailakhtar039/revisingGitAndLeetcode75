package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseSchedule2 {
    public static void main(String[] args) {

    }
    public int[] findOrder(int n, int[][] pre) {
        List<Integer>[] list = new ArrayList[n];
        int[] indeg = new int[n];
        boolean[] vis = new boolean[n];
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<n; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<pre.length; i++){
            indeg[pre[i][0]]++;
            list[pre[i][1]].add(pre[i][0]);
        }

        for(int i = 0; i<n; i++){
            if(indeg[i] == 0)
                queue.add(i);
        }
        if(queue.size() == 0){
            return new int[0];
        }
        while(!queue.isEmpty()){
            int firstNode = queue.poll();
            vis[firstNode] = true;
            ans.add(firstNode);

            for(int i = 0; i<list[firstNode].size(); i++){
                int node = list[firstNode].get(i);
                indeg[node]--;
                if(indeg[node] == 0)
                    queue.add(node);
            }
        }
        if(ans.size()==n){
            int[] res = new int[ans.size()];
            for(int i = 0; i<ans.size(); i++)
                res[i] = ans.get(i);
            return res;
        }else{
            return new int[0];
        }
    }
}
