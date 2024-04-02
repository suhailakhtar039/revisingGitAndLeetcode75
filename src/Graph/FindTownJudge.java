package Graph;

public class FindTownJudge {
    public int findJudge(int n, int[][] trust) {
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        for (int[] example : trust) {
            inDegree[example[1]]++;
            outDegree[example[0]]++;
        }

        int cnt = 0;
        int ans = -1;
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == n - 1 && outDegree[i] == 0) {
                ans = i;
                cnt++;
            }
        }
        return cnt > 1 ? -1 : ans;
    }
}
