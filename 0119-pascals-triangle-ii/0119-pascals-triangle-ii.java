class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> a1=new ArrayList<>();
        a1.add(new ArrayList<>());
        a1.get(0).add(1);
        if(rowIndex==0)
        {
            return a1.get(rowIndex);

        }
        a1.add(new ArrayList<>());
        a1.get(1).add(1);
        a1.get(1).add(1);
        for(int i=2;i<=rowIndex;i++)
        {
             a1.add(new ArrayList<>());
             a1.get(i).add(1);
             for(int j=1;j<=i-1;j++)
             {
                a1.get(i).add(a1.get(i-1).get(j)+a1.get(i-1).get(j-1));
             }
             a1.get(i).add(1);
        }
        
     return a1.get(rowIndex);
    }
}