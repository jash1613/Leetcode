class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0,high=matrix[0].length-1,i=0;
        while(low<=high&&i!=matrix.length)
        {
            int mid=(low+high)/2;
            if(matrix[i][mid]==target)
            {
                return true;
            }
            else if(matrix[i][mid]>target)
            {
                high=mid-1;
            }
            else
            {
                if(matrix[i][matrix[i].length-1]<target)
                {
                    low=0;
                    high=matrix[i].length-1;
                    i=i+1;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        return false;
    }
}