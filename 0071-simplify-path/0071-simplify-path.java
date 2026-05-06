class Solution {
    public String simplifyPath(String path) {
        Stack<String> s=new Stack<>();
        String []parts=path.split("/");
        for(int i=0;i<parts.length;i++)
        {
              if (parts[i].equals("") || parts[i].equals(".")) {
                continue;
            }
           else if(parts[i].equals(".."))
            {
                if(!s.isEmpty())
                {
                    s.pop();
                }
            }
            else
            {
                s.push(parts[i]);
            }
           
        }
        StringBuffer sb=new StringBuffer();
        for(String i:s){
            sb.append('/');
            sb.append(i);
        }
        if(sb.length()==0)
        {
            return "/";
        }
        return sb.toString();
    }
}