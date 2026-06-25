class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for(int i=0;i<9;i++)
        {
             HashSet<Character> h1=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                if(!h1.contains(board[i][j]))
                {
                    h1.add(board[i][j]);
                }
                else
                {
                    return false;
                }
            }
        }
            for(int j=0;j<9;j++)
        {
             HashSet<Character> h2=new HashSet<>();
            for(int i=0;i<9;i++)
            {
                 if(board[i][j]=='.')
                {
                    continue;
                }
                if(!h2.contains(board[i][j]))
                {
                    h2.add(board[i][j]);
                }
                else
                {
                    return false;
                }
            }
        }
        for(int i=0;i<9;i=i+3)
        {
            for(int j=0;j<9;j=j+3)
            {
                HashSet<Character> h3=new HashSet<>();
                for(int k=i;k<i+3;k++)
                {
                    for(int l=j;l<j+3;l++)
                    {
                        if(board[k][l]=='.')
                {
                    continue;
                }
                if(!h3.contains(board[k][l]))
                {
                    h3.add(board[k][l]);
                }
                else
                {
                    return false;
                }
                    }
                }
    
    }
}
return true;
    }}