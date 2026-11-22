class Solution {
    public boolean checkString(String s) {
        if(s.length()==1)
        {
            return true;
        }
        int c=s.length();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='b')
            {
                c=i;
                break;
            }
        }
        for(int i=c;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                return false;
            }
        }
    return true;
    }
}