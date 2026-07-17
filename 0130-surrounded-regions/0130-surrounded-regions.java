class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((board[i][j]=='O') && (i==0 || j==0 || i==m-1 || j==n-1))
                {
                    dfs(i,j,board);
                }

            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='S')
                {
                    board[i][j]='O';
                }
            }
        }
        

    }
    public void dfs(int i,int j,char [][]board)
    {
          if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j]!='O')
          {
            return;
          }
          board[i][j]='S';
          dfs(i+1,j,board);
          dfs(i-1,j,board);
          dfs(i,j-1,board);
          dfs(i,j+1,board);
    }
}