class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h1=new HashSet<>();
        int i=0,j=0;
        int max=0;
        while(j<s.length())
        {
            while(h1.contains(s.charAt(j)))
            {
                  h1.remove(s.charAt(i));
                  i++;
            }
            h1.add(s.charAt(j));
            j++;
            max=Math.max(max,j-i);
        }
        return max;
        
    }
}