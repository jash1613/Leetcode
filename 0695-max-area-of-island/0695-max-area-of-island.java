class Solution {
    int maxc=0;
    int c=0;
    public int maxAreaOfIsland(int[][] grid) {
       
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid[0].length;j++)
        {
            if(grid[i][j]==1)
            {
                c=0;
                dfs(grid,i,j);
              if(maxc<c)
              {
                maxc=c;
              }
            }
        }
       
    }
    return maxc;
    }
public void dfs(int [][]grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]!=1)
        {
            return;
        }
        grid[i][j]=0;
        c++;
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i,j-1);
    }
    }
