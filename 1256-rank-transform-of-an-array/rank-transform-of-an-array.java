class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int m[]=arr.clone();
        Arrays.sort(m);int c=1;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:m)
        {
            
            if(!map.containsKey(i))
            {
                map.put(i,c++);
            }
        }
        int res[]=new int[arr.length];
        for(int i=0;i<res.length;i++)
        {
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}