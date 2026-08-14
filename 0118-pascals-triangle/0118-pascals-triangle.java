class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l1=new ArrayList<>();
        l1.add(new ArrayList<>());
        l1.get(0).add(1);
        if(numRows==1)
        {
            return l1;
        }
          l1.add(new ArrayList<>());
          l1.get(1).add(1);
          l1.get(1).add(1);
          for(int j=2;j<numRows;j++)
          {
            l1.add(new ArrayList<>());
            l1.get(j).add(1);
            for(int i=0;i<j-1;i++)
            {
                l1.get(j).add(l1.get(j-1).get(i)+l1.get(j-1).get(i+1));
            }
            l1.get(j).add(1);
          }
    return l1; 
    }
}