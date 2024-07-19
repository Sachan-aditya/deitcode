import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }

           
            boolean isMaxInColumn = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][minIndex] > min) {
                    isMaxInColumn = false;
                    break;
                }
            }

            if (isMaxInColumn) {
                list.add(min);
            }
        }

        return list;
    }
}


