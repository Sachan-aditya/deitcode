class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set =new HashSet<>();
        int c=0;
        for(int i:nums)
        {
            if(!set.contains(i))
            {
            set.add(i);
            nums[c++]=i;
            }
        }
  return c;

    }
}