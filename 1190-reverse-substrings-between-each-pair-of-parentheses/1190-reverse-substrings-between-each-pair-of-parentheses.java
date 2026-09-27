class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=')')
            {
                s1.push(s.charAt(i));
            }
            if(s.charAt(i)==')')
            {
                StringBuilder sb=new StringBuilder();
                 while(s1.peek()!='(')
                 {
                     
                     sb.append(s1.pop());
                 }
                 s1.pop();
                for (int j = 0; j < sb.length(); j++) {
                    s1.push(sb.charAt(j));
                }
            }
        }
          StringBuilder ans = new StringBuilder();

        while (!s1.isEmpty()) {
            ans.append(s1.pop());
        }

        return ans.reverse().toString();
    }
}