package DynamicProgramming;

public class HouseRobber2 {
    private static int findMaxProfit(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ans[0] = arr[0];
        if(n==1)return ans[0];
        ans[1] = arr[1];
        if(n<=2)return Math.max(arr[0],arr[1]);
        ans[1] = Math.max(arr[0],arr[1]);
        for(int i=2; i<n; i++){
            // pick
            int pick = arr[i] + ans[i-2];
            int notPick = ans[i-1];
            ans[i] = Math.max(pick,notPick);
        }
        return ans[n-1];
        // int
    }
    public static int rob(int[] arr) {
        int n = arr.length;
        if(n==1)return arr[0];
        int[] arr1 = new int[n-1];
        int[] arr2 = new int[n-1];
        for(int i=0; i<n-1; i++){
            arr1[i] = arr[i];
            arr2[i] = arr[i+1];
        }
        return Math.max(findMaxProfit(arr1),findMaxProfit(arr2));
    }
    public static void solve(){
        int[]a = {2,3,4,1};
        int ans = rob(a);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        solve();
    }
}
