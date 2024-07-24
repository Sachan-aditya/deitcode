import java.util.*;

class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] mappedWithIndex = new int[n][2];
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 10; ++i) {
            map.put(i, mapping[i]);
        }
        
        for (int i = 0; i < n; ++i) {
            int originalNum = nums[i];
            int mappedNum = originalNum == 0 ? map.get(0) : 0;
            int placeValue = 1;
            
            while (originalNum > 0) {
                int digit = originalNum % 10;
                mappedNum += placeValue * map.get(digit);
                placeValue *= 10;
                originalNum /= 10;
            }
            
            mappedWithIndex[i] = new int[] {mappedNum, i};
        }
        
        Arrays.sort(mappedWithIndex, (a, b) -> 
            a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; ++i) {
            sortedArray[i] = nums[mappedWithIndex[i][1]];
        }
        
        return sortedArray;
    }
}
