class Solution {

    public boolean issafe(int row,int col,char[][] board)
    {
        int r=row;
        int c=col;
        //vertical check
        while(r>=0)
        {
            if(board[r][c]=='Q')
            {
               return false;
            }
            r--;
        }
        //left diagonal check
        r=row;
        c=col;
        while(r>=0 && c>=0)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        r=row;
        c=col;
        while(r>=0 && c<board.length)
        {
            if(board[r][c]=='Q')
            {
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    public void solve(int row,int n,char[][] board,List<List<String>> res)
    {
        if(row==n)
        {
            List<String> temp =new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;

        }


        for(int col=0;col<n;col++)
        {
            if(issafe(row,col,board))
            {
                board[row][col]='Q';
                solve(row+1,n,board,res);
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char [][]board=new char[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(board[i],'.');
        }
        List<List<String>> res=new ArrayList<>();
        solve(0,n,board,res);
        return res;
    }
}