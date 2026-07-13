class Solution {
    List<List<Integer>> l;
    public List<List<Integer>> combine(int n, int k) {
        l=new ArrayList<>();
        List<Integer> l1=new ArrayList<>();
        combines(1,n,k,l1);
        return l;
    }
    public void combines(int i,int n,int k,List<Integer> l1)
    {
        if(l1.size()==k)
        {
            l.add(new ArrayList<>(l1));
            return;
        }
        if(i>n)
        {
            return;
        }
        l1.add(i);
        combines(i+1,n,k,l1);
        l1.remove(l1.size()-1);
        combines(i+1,n,k,l1);
    }
}