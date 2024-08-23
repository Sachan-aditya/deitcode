class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
       
        int n=nums.length;
        if(n<3)
        return list;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            continue;
          
                int n1=nums[i];
                int  target=-n1;
            twosum(nums,target,i+1,n-1,list);
        }
        return list;
    }
    public void twosum(int []nums,int target,int i,int j,List<List<Integer>> list)
    {
        while(i<j)
        {
            if(nums[i]+nums[j]>target)
            j--;
           else if(nums[i]+nums[j]<target)
            i++;
            else
        {
            while(i<j && nums[i]==nums[i+1])i++;
            while(i<j && nums[j]==nums[j-1])j--;
             List<Integer> res=new ArrayList<>();
            res.add(-target);
              res.add(nums[i]);
              res.add(nums[j]);
              list.add(res);
            i++;
            j--;
        }
        }
    }
}