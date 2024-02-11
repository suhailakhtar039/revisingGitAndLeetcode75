public class maxElementInRotatedArray {
    public static int solve(){
        int[] arr = {10,15,17,4,5,6,7};
        if (arr == null || arr.length == 0) {
            return 0;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        int n = arr.length;
        int st = 0, en = n - 1;
        while (st < en) {
            int mid = (st + en) / 2;
            if (arr[st] < arr[en]) return arr[st];
            if (arr[mid] >= arr[st])
                st = mid + 1;
            else
                en = mid;
        }
        return arr[st];
    }
    public static void main(String[] args) {
        solve();
    }
}
