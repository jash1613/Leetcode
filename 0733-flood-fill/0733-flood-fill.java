class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      if(image[sr][sc]==color)
      {
        return image;
      }
      int o=image[sr][sc];
      dfs(sr,sc,image,color,o);
      return image;
    }
    public void dfs(int i,int j,int[][]image,int color,int o)
    {
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j]!=o)
        {
            return;
        }
        image[i][j]=color;
        dfs(i-1,j,image,color,o);
        dfs(i,j-1,image,color,o);
        dfs(i+1,j,image,color,o);
        dfs(i,j+1,image,color,o);
    }
}