class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int p=target-nums[i];
            if(map.containsKey(p))
            return new int []{map.get(p),i};
            else
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}