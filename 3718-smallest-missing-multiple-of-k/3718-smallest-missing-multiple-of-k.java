class Solution {
    public int missingMultiple(int[] nums, int k) {
       boolean []c=new boolean[201];
       for(int i:nums)
       {
         c[i]=true;
       }
       int a=k;
       while(c[a])
       {
           a+=k;
       }
       return a;
    }
}