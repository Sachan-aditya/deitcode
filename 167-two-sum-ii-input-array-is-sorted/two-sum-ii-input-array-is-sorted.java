class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
           int p=target-numbers[i];
           if(map.containsKey(p))
           {
         return new int []{map.get(p)+1,i+1};
           }
           else
           map.put(numbers[i],i);
        }
        return new int[]{-1,-1};
    }
}