class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        subsets(nums,0,new ArrayList<>());
        return res;
    }
        public void subsets(int nums[],int index,List<Integer>sublist)
        {
            if(index==nums.length)
            {
            res.add(new ArrayList<>(sublist));
            return;
            }
            //pick
            sublist.add(nums[index]);
            subsets(nums,index+1,sublist);
            sublist.remove(sublist.size()-1);
            //nopick
             subsets(nums,index+1,sublist);


        
    }
}