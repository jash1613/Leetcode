class Solution {
    public int trap(int[] height) {
        int []lmax=new int[height.length];
        int []rmax=new int[height.length];
        int []min=new int[height.length];
        int l=0,r=0;
        for(int i=0;i<height.length;i++)
        {
            if(l<height[i])
            {
                l=height[i];
            }
            lmax[i]=l;
            
        }
        for(int i=height.length-1;i>=0;i--)
        {
            if(r<height[i])
            {
                r=height[i];
            }
            rmax[i]=r;
            
        }
        for(int i=0;i<height.length;i++)
        {
            min[i]=Math.min(lmax[i],rmax[i]);
            min[i]=min[i]-height[i];
        }
        int sum=0;
        for(int i=0;i<height.length;i++)
        {
            if(min[i]>0)
            {
                sum+=min[i];
            }
        }
        return sum;
        
    }
}