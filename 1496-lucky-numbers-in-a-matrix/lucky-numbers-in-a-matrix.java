import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int minCol = -1;

            // Find the minimum value in the current row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minCol = j;
                }
            }

            boolean isMaxInCol = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minCol] > min) {
                    isMaxInCol = false;
                    break;
                }
            }

            if (isMaxInCol) {
                list.add(min);
            }
        }
        
        return list;
    }
}
