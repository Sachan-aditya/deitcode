class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        int s[]=arr.clone();
        Arrays.sort(s);int r=1;
        for(int i:s)
        {
            if(!map.containsKey(i))
            {
                map.put(i,r++);
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