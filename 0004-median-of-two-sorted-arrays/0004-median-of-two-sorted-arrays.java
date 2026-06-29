class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []arr=new int[nums1.length+nums2.length];
        int j=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr[j++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr[j++]=nums2[i];
        }
        Arrays.sort(arr);
        double median=0;
        int mid=(0+arr.length-1)/2;
        if(arr.length%2==0)
        {
            median=(double)(arr[mid]+arr[mid+1])/2;
        }
        else
        {
            median=(double)arr[mid];
        }
        return median;
    }
}