package Array;

public class IncreasingTripletSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};

        boolean ans = false;
        int small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        for(int i:nums){
            if(i <= small){
                small = i;
            }
            else if(i <= big){
                big = i;
            }
            else{
                ans = true;
            }
        }
    }
}
