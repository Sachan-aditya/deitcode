class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int current=0;
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
            current+=gas[i]-cost[i];
            if(current<0)
            {
                start=i+1;
                current=0;
            }
        }
        return (totalgas>=totalcost)?start:-1;
    }
}