class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> h1=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
           String s=strs[i];
           char []arr=s.toCharArray();
           Arrays.sort(arr);
           String a=String.valueOf(arr);
           if(!h1.containsKey(a))
           {
              List<String> l1=new ArrayList<>();
              l1.add(strs[i]);
              h1.put(a,l1);
           }
           else
           {
            h1.get(a).add(strs[i]);
           }
        }
        return new ArrayList<>(h1.values());
    }
}