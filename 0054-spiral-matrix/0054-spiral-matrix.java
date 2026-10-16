
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (l.size() < matrix.length * matrix[0].length) {

            for (int j = left; j <= right; j++) {
                l.add(matrix[top][j]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                l.add(matrix[i][right]);
            }
            right--;

          
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    l.add(matrix[bottom][j]);
                }
                bottom--;
            }

          
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    l.add(matrix[i][left]);
                }
                left++;
            }
        }

        return l;
    }
}
