package Array;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int []height = {0, 2, 0, 2};

        int n = height.length;
        int st = 0, en = n-1;
        int mxArea = Math.min(height[1], height[0]);
        while(st<en){
            int area = Math.min(height[en], height[st])*(en - st);
            mxArea = Math.max(area, mxArea);
            if(height[en] < height[st])
                en--;
            else st++;
        }
        System.out.println(mxArea);
    }
}
