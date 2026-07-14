class Solution {
    public int findTheWinner(int n, int k) {
        // ArrayList<Integer> l1=new ArrayList<>();
        // for(int i=1;i<=n;i++)
        // {
        //     l1.add(i);
        // }
        // int i=0;
        // while(l1.size()>1)
        // {
        //     int idx=(i+k-1)%(l1.size());
        //     l1.remove(idx);
        //     i=idx;
        // }
        // return l1.get(0);
        // aapporach2
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=1;i<=n;i++)
        {
            q.offer(i);
        }
        while(q.size()>1)
        {
            for(int i=0;i<k-1;i++)
            {
                q.offer(q.poll());
            }
            q.poll();
        }
        return q.peek();
    }
}