package Array;

public class buyAndSellStock {

    public static void solve(){
        int[] a = {5,4,3,2};
        int profit = 0;
        int firstDayStock = a[0];
        int n = a.length;
        for(int i = 1; i<n; i++){
            firstDayStock = Math.min(firstDayStock, a[i]);
            if((a[i]-firstDayStock) > profit){
                profit = a[i]-firstDayStock;
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        solve();
    }
}
