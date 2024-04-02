package Graph;

import java.util.ArrayList;
import java.util.List;

public class NumberOfProvince {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        List<Integer>[] list = new ArrayList[n];
        boolean[] vis = new boolean[n];
        int component = 0;

        for(int i = 0; i<n; i++)
            list[i] = new ArrayList<>();
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i == j)continue;
                if(isConnected[i][j] == 1){
                    list[i].add(j);
                }
            }
        }
        for(int i = 0; i<n; i++){
            if(vis[i])continue;
            dfs(list,vis, i);
            component++;
        }
        return component;
    }

    public void dfs(List<Integer>[] list, boolean[] vis, int source){
        if(vis[source])return ;
        vis[source] = true;
        for(int i = 0; i<list[source].size(); i++){
            if(!vis[list[source].get(i)]){
                dfs(list,vis,list[source].get(i));
            }
        }
    }
}
