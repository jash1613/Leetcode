class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         List<Integer> a=new ArrayList<>();
        int i=nums1.length-1;
        int j=nums2.length-1;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i>=0 && j>=0)
        {
            if(nums1[i]<nums2[j])
            {
                j--;

            }
            else if(nums1[i]==nums2[j])
            {
                a.add(nums1[i]);
                i--;
                j--;

            }
            else
            {
                i--;
            }
        }
        int[] result = new int[a.size()];
        for (int k = 0; k < a.size(); k++) {
            result[k] = a.get(k);
        }
        
    return result;
    }
}