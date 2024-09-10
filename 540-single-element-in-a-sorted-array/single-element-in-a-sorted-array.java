class Solution {
    public int singleNonDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums)
        {
            if(!set.contains(i))
            set.add(i);
            else
            set.remove(i);

        }
        return set.iterator().next();
    }
}