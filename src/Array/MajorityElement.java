package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {4,4,5,4,2};
        int n = arr.length, cur = arr[0], cnt = 1;
        for(int i = 1; i<n; i++){
            if(cur == arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
            if(cnt == 0){
                cur = arr[i];
                cnt = 1;
            }
        }
        System.out.println(cur);
    }
}
