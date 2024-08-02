class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalone = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                totalone++;
            }
        }

        int i = 0, j = 0, csum = 0, max = 0;

        while (j < 2 * n) {
            if (nums[j%n] == 1) {
                csum++;
            }
            if (j - i + 1 > totalone) {
                if (nums[i%n] == 1) {
                    csum--;
                }
                i++;
            }
            max = Math.max(max, csum);
            j++;
        }

        return totalone - max;
    }
}
