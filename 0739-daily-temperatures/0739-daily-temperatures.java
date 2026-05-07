class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<>();
        int []ans=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()])
            {
                int temp=s.pop();
                ans[temp]=i-temp;
            }
            s.push(i);
        }
        return ans;
    }
}