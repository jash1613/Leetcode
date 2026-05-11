class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>k=new ArrayList<>();
        int j=0;
        for(int num: nums)
        {
            List<Integer> tempList = new ArrayList<>();
            int temp=num;
            while(temp>0)
            {
                tempList.add(temp%10);
                temp=temp/10;
            }
            for(int i=tempList.size()-1;i>=0;i--)
            {
                k.add(tempList.get(i));
            }
        }
        int []arr=new int[k.size()];
        for(int i: k)
        {
            arr[j++]=i;
        }
        return arr;
    }
}