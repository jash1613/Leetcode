class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        int []arr=new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
        {
            while(!s.isEmpty() && nums2[i]>nums2[s.peek()])
            {
                map.put(nums2[s.pop()],nums2[i]);
            }
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(map.containsKey(nums1[i]))
            {
                arr[i]=map.get(nums1[i]);
            }
            else
            {
                arr[i]=-1;
            }
        }
        return arr;
    }
}