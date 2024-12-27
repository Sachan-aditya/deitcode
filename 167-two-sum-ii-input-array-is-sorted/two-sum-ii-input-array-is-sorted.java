class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
        int p=target-nums[i];//9-2
        if(map.containsKey(p))
        {
            return new int[]{map.get(p)+1,i+1};
        }
        map.put(nums[i],i);//7-0,
        }

        return new int []{-1,-1};
    }
}