class Solution {
    public boolean isvalid(String s)
    {
        char [] arr=s.toCharArray();
        int x=0;
        for(char ch:arr)
        {
            if(ch=='(')
            {
                x++;
            }
            if(ch==')')
            {
                x--;
            }
            if(x<0)
            {
                return false;
            }
        }
        return x==0;
    }
    public void solve(int n,String s,List<String> res)
    {
          if(s.length()==2*n)
          {
            if(isvalid(s))
            {
                res.add(s);
            }
            return;
          }
          solve(n,s+'(',res);
          solve(n,s+')',res);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        solve(n,"",res);
        return res;

    }
}