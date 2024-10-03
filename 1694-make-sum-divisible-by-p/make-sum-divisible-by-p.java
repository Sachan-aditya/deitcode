class Solution {
    public int minSubarray(int[] nums, int p) {
    long s = 0;
        for (int i : nums) {
            s += i;
        }
        int rem=(int)(s%p);
        if (rem == 0) {
            return 0;
        } else {
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            long sum = 0;
            int minLen = nums.length;
            for (int i = 0; i < nums.length; i++) {
                sum+=nums[i];
                int c=(int)(sum%p);
                int target = (c- rem+ p) % p;
                if (map.containsKey(target)) {
                    minLen = Math.min(minLen, i - map.get(target));
                }
                map.put(c, i);
            }
            if(minLen==nums.length)
            return -1;
            else
           return minLen;
        }
    }
}