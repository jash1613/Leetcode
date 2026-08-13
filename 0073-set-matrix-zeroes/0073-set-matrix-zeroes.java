class Solution {
    public void setZeroes(int[][] matrix) {
       int []row=new int[matrix.length];
       int []cols=new int[matrix[0].length];
       int r=matrix.length;
       int c=matrix[0].length;
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if(matrix[i][j]==0)
            {
                row[i]=1;
                cols[j]=1;
            }
        }
       }
       for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}