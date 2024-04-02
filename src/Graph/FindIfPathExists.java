package Graph;

public class FindIfPathExists {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] parent = new int[n];
        for (int i = 0; i < n; i++)
            parent[i] = i;

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            int pu = findParent(parent, u), pv = findParent(parent, v);
            parent[pu] = pv;
        }
        boolean ans = (findParent(parent, source) == findParent(parent, destination));
        return ans;
    }

    public int findParent(int[] parent, int x) {
        if (parent[x] == x)
            return x;
        return parent[x] = findParent(parent, parent[x]);
    }
}
