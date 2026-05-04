class Solution {
    public void rotate(int[][] matrix) {
         int[][] a=new int[matrix.length][matrix.length];
        int l=0,k=0;
        for(int j=0;j<matrix.length;j++)
        {
            k=0;
            for(int i=matrix.length-1;i>=0;i--)
            {
                a[l][k++]=matrix[i][j];
            }
            l++;
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                matrix[i][j]=a[i][j];
            }
        }
    }
}