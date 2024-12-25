class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int c=nums.length/2;
      for(int i:nums) 
      {
        map.put(i,map.getOrDefault(i,0)+1);

      } 
      for(int i:map.keySet())
      {
        if(map.get(i)>c)
        return i;
      }
      return -1;
    }
}