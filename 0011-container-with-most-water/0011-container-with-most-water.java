class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int h=height.length-1;
        int max=Integer.MIN_VALUE;
        while(l<h)
        {
            int temp=0;
            if(height[h]>=height[l])
            {
                temp=height[l]*(h-l);
                l++;
            }
            else if(height[l]>height[h])
            {
                temp=height[h]*(h-l);
                h--;

            }
            if(temp>max)
            {
                max=temp;
            }
        }
        return max;
    }
}