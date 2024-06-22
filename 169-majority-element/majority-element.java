class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int major = 0;
        int res = 0;
        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if(map.get(i) > major) {
                res = i;
                major = map.get(i);
            }
        }
        return res;
    }
}