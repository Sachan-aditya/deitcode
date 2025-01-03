class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int current=0;
        int start=0;//12345 //34512
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];//15
            totalcost+=cost[i];//15
            current+=gas[i]-cost[i];//6
            if(current<0) 
            {
            start=i+1;//4
            current=0;
            } 

        }
        return (totalgas>=totalcost)?start:-1;
       
    }
}