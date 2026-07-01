class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a1=new ArrayList<>();
        a1.add(new ArrayList<>());
         a1.get(0).add(1);
         if(numRows==1)
         {
            return a1;
         }
        a1.add(new ArrayList<>());
        
        a1.get(1).add(1);
        a1.get(1).add(1);
        for(int j=2;j<numRows;j++)
        {
             a1.add(new ArrayList<>());
             a1.get(j).add(1);
             for(int i=1;i<=j-1;i++)
             {
                a1.get(j).add(a1.get(j-1).get(i)+a1.get(j-1).get(i-1));
             }
             a1.get(j).add(1);

        }

        return a1;
    }
    
}