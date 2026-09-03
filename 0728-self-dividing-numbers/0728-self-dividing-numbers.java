class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l1=new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            int temp=i;
            boolean f=true;
            while(temp>0)
            {
                int d=temp%10;
                if(d==0 || i%d!=0)
                {
                    f=false;
                    break;
                }
                temp=temp/10;

            }
            if(f)
            {
                l1.add(i);
            }
        }
        return l1;
    }
}