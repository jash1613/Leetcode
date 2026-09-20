class Solution {
    public int reverseDegree(String s) {
        int mul;
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
                mul=1;
                int temp='z'-s.charAt(i)+1;
                 mul=mul*((i+1)*temp);
                 sum+=mul;
        }
        return sum;
    }
}