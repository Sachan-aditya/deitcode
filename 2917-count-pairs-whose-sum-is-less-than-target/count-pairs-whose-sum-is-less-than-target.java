
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int res = 0;
        nums.sort((a, b) -> a - b);
        int left = 0;
        int right = nums.size() - 1;
        while (left <= right) {
            if (nums.get(left) + nums.get(right) < target) {
                res+=right-left; 
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}//-1 1 1 2 3