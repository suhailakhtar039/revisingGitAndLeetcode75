package Graph;

import java.util.ArrayList;
import java.util.List;

public class MinimumHeightTrees {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (n == 1) {
            result.add(0);
            return result;
        }

        List<Integer>[] adj = new ArrayList[n];
        int[] deg = new int[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
            deg[edge[0]]++;
            deg[edge[1]]++;
        }

        List<Integer> prev = new ArrayList<>();
        List<Integer> next;
        for (int i = 0; i < n; i++) {
            if (deg[i] == 1) {
                prev.add(i);
            }
        }

        while (true) {
            next = new ArrayList<>();
            for (int i = 0; i < prev.size(); i++) {
                int t = prev.get(i);
                for (int neighbor : adj[t]) {
                    deg[neighbor]--;
                    if (deg[neighbor] == 1) {
                        next.add(neighbor);
                    }
                }
            }
            if (next.isEmpty()) {
                return prev;
            }
            prev = next;
        }
    }
}
