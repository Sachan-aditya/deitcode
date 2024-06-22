class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count = 0, oddCount = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for (int num : nums) {
            if ((num & 1) == 1) {
                oddCount++;
            }
            if (map.containsKey(oddCount - k)) {
                res += map.get(oddCount - k);
            }
            map.put(oddCount, map.getOrDefault(oddCount, 0) + 1);
        }
        
        return res;
    }
}