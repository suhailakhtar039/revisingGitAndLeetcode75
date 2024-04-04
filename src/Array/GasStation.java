package Array;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int c=0,idx = 0,sum=0;
        for(int i=0;i<gas.length;i++)
        {
            c+=gas[i]-cost[i];
            sum+=gas[i]-cost[i];
            if(sum<0){
                idx=i+1;
                sum=0;
            }
        }
        if(c<0)return -1;
        return idx;
    }
}
