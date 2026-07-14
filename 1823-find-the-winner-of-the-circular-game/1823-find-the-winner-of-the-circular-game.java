class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            l1.add(i);
        }
        int i=0;
        while(l1.size()>1)
        {
            int idx=(i+k-1)%(l1.size());
            l1.remove(idx);
            i=idx;
        }
        return l1.get(0);
    }
}