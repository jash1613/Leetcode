class Solution {
    public String reverseWords(String s) {
     String []arr=s.split(" ");
    StringBuilder ans=new StringBuilder();
     for(int i=0;i<arr.length;i++)
     {
             StringBuilder sb=new StringBuilder(arr[i]);
             ans.append(sb.reverse());
             if(i!=arr.length-1)
             {
                ans.append(" ");
             }

    }
    return ans.toString();
    
}
}