class Solution {
    public int majorityElement(int[] nums) {
        int major=0;int res=0;
      Map<Integer,Integer> map=new HashMap<>();
      for(int i:nums)
      {
        map.put(i,map.getOrDefault(i,0)+1);//3,1//
        if(map.get(i)>major)//3>0
        {
            res=i;//3
            major=map.get(i);//0
        }
      }
      return res;
    }
}//323