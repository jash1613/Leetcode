class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int []edge:edges)
        {
            int v1=edge[0];
            int v2=edge[1];
            graph.get(v1).add(v2);
            graph.get(v2).add(v1);
        }
        int []visited=new int[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        while(!q.isEmpty())
        {
            int curr=q.poll();
            if(curr==destination)
            {
                return true;
            }
            if(visited[curr]==0)
            {
                visited[curr]=1;
                for(int nei:graph.get(curr))
                {
                    if(visited[nei]==0)
                    {
                        q.offer(nei);
                    }
                }
            }
        }
        return false;
    }
}