class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            int find=target-numbers[i];
            if(map.containsKey(find))
            return new int[]{map.get(find)+1,i+1};
            else
            map.put(numbers[i],i);

        }
        return new int []{-1,-1};
    }
}