class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] a = new int[2 * n];
        
        // Create the extended array to simulate circular array
        for (int i = 0; i < 2 * n; i++) {
            a[i] = nums[i % n];
        }
        
        // Count total number of 1s
        int totalone = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                totalone++;
            }
        }

        int i = 0, j = 0, csum = 0, max = 0;
        
        // Use sliding window to find the maximum number of 1s in a window of size totalone
        while (j < 2 * n) {
            if (a[j] == 1) {
                csum++;
            }
            if (j - i + 1 > totalone) {
                if (a[i] == 1) {
                    csum--;
                }
                i++;
            }
            max = Math.max(max, csum);
            j++;
        }
        
        // The result is the number of swaps needed
        return totalone - max;
    }
}
