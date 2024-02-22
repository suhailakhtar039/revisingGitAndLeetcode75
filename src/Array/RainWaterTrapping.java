package Array;

public class RainWaterTrapping {
    public static void main(String[] args) {
        int[] height = {2,1,3,1,4};

        int n = height.length;
        int res = 0;
        int left = 0, right = n-1;
        int maxLeft = 0, maxRight = 0;
        while(left <= right){
            if(height[left] >= height[right]){
                maxRight = Math.max(height[right],maxRight);
                res += maxRight - height[right--];
            }
            else{
                maxLeft = Math.max(maxLeft,height[left]);
                res+= maxLeft - height[left++];
            }
        }

        System.out.println(res);
    }
}
