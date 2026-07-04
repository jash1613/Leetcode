class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int[] f1= new int[26];
        int[] f2= new int[26];
        for(int i=0;i<s1.length();i++)
        {
            f1[s1.charAt(i)-'a']++;
        }
      
        for(int i=0;i<s1.length();i++)
        {
            f2[s2.charAt(i)-'a']++;
            
        }
        if(Arrays.equals(f1,f2))
        {
            return true;
        }
        for(int i=s1.length();i<s2.length();i++)
        {
              
            f2[s2.charAt(i-s1.length())-'a']--;
            f2[s2.charAt(i)-'a']++;
            if(Arrays.equals(f1,f2))
            {
                return true;
            }
        }
        return false;
    }
}