class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
         for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                max = Math.max(max, j - stack.pop());
            }
        }
        
        return max;
    }
}
