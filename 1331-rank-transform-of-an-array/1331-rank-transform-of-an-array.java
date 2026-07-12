class Solution {
    public int[] arrayRankTransform(int[] arr) {
           int[] temp = arr.clone();
        Arrays.sort(temp);
      
        HashMap<Integer,Integer> h1=new HashMap<>();
        int r=1;
        for(int i=0;i<arr.length;i++)
        {
            if(!h1.containsKey(temp[i]))
            {
            h1.put(temp[i],r++);
            }
        }
        int []nums=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=h1.get(arr[i]);
        }
       return nums;
    }
}