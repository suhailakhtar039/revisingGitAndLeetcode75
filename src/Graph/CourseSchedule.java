package Graph;

import java.util.ArrayList;
import java.util.List;

class GraphUtil{
    List<List<Integer>> adj = new ArrayList<>();
    GraphUtil(int n){
        for(int i = 0; i<n; i++)
            adj.add(new ArrayList<>());
    }
    public boolean canFinish(int numCourses, int[][] prerequisites){
        for(int[] a:prerequisites){
            adj.get(a[1]).add(a[0]);
        }
        boolean[] vis = new boolean[numCourses];
        boolean[] inStack = new boolean[numCourses];
        boolean ans = false;
        for(int i = 0; i<numCourses; i++){
            ans = canFinishUtil(i, vis, inStack);
            if(ans)
                return false;
        }
        return true;
    }

    public boolean canFinishUtil(int a, boolean[] vis, boolean[] inStack) {
        if(inStack[a])
            return true;
        if(vis[a]) {
            return false;
        }
        vis[a] = true;
        inStack[a] = true;
        List<Integer> parent = adj.get(a);
        for(int neighbors:adj.get(a)){
            if(canFinishUtil(neighbors,vis,inStack))
                return true;
        }
        inStack[a] = false;
        return false;
    }
}

public class CourseSchedule {
    public static void main(String[] args) {
        GraphUtil graphUtil = new GraphUtil(2);
        System.out.println(graphUtil.canFinish(2,new int[][]{{1,0},{0,1}}));
    }
}
