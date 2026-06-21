class Solution {
    public boolean isPalindrome(String s) {
       int l=0;
       int r=s.length()-1;
       while(l<r)
       {
             if(!Character.isLetterOrDigit(s.charAt(l)))
             {
                l++;
                continue;
             }
             if(!Character.isLetterOrDigit(s.charAt(r)))
             {
                r--;
                continue;
             }
             char leftChar = Character.toLowerCase(s.charAt(l));
            char rightChar = Character.toLowerCase(s.charAt(r));
            if(leftChar!=rightChar)
            {
                return false;

            }
            else
            {
                l++;
                r--;
            }
       }
       return true;

    }
}