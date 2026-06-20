class Solution {
    public String decodeString(String s) {
        Stack<Character> s1=new Stack<>();
        StringBuilder sb2=new StringBuilder();
       
        for(char a:s.toCharArray())
        {
            if(a!=(']'))
            {
                s1.push(a);
            }
            else
            {
            StringBuilder sb=new StringBuilder();
             StringBuilder sb1=new StringBuilder();
            while(!s1.isEmpty() && s1.peek()!=('['))
            {
                sb.append(s1.pop());

            }
             
            sb.reverse();
           s1.pop();
            StringBuilder num = new StringBuilder();
         while(!s1.isEmpty() && Character.isDigit(s1.peek()))
         {
                num.append(s1.pop());
        }
        num.reverse();
         int d = Integer.parseInt(num.toString());
          
           

                while(d > 0)
                {
                    sb1.append(sb);
                    d--;
                }
                 for(char temp:sb1.toString().toCharArray())
           {
            s1.push(temp);
           }
           
        }
    
    }
         for(char a1:s1)
            {
                sb2.append(a1);
            }
        return sb2.toString();
}
}
