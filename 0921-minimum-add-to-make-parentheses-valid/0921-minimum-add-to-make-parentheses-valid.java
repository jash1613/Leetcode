class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
             if(s.charAt(i)==')' && !s1.isEmpty() && s1.peek()=='(' )
             {
                s1.pop();
             }
             else
             {
                s1.push(s.charAt(i));
             }
        }
        return s1.size();
    }
}