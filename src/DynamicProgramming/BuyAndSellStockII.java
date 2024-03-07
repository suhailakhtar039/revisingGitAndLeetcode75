package DynamicProgramming;

public class BuyAndSellStockII {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] nums) {
        int n = nums.length;
        if(n == 1)return 0;
        int ans = 0;
        for(int i=0;i<n;)
        {
            int j=i+1;
            int mx=nums[i];
            while(j<n && nums[j]>nums[j-1])
            {
                mx=Math.max(mx,nums[j]);
                j++;
            }
            //        cout<<"i= "<<i<<" j= "<<j<<" mx= "<<mx<<" a[i]= "<<a[i]<<endl;
            ans+=mx-nums[i];
            i=j;
        }
        return ans;
    }
}
