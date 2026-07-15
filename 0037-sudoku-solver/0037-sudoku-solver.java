class Solution {
    public boolean isvalid(int row,int col,char c,char[][] board)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==c)
            {
                return false;
            }
            if(board[i][col]==c)
            {
                return false;
            }
        }
        int  start_i=(row/3)*3;
        int start_j=(col/3)*3;
        for(int k=0;k<3;k++)
        {
            for(int l=0;l<3;l++)
            {
                if(board[start_i+k][start_j+l]==c)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean solve(char [][]board)
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    for(char c='1';c<='9';c++)
                    {
                        if(isvalid(i,j,c,board))
                        {
                            board[i][j]=c;
                            if(solve(board))
                            {
                                return true;
                            }
                            board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}