class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean []visited=new boolean[rooms.size()];
        dfs(0,rooms,visited);
        for(boolean b: visited)
        {
            if(!b)
            {
                return false;
            }
        }
        return true;
    }
    public void dfs(int room,List<List<Integer>>rooms,boolean []visited)
    {
        visited[room]=true;
        for(int key:rooms.get(room))
        {
            if(!visited[key])
            {
                dfs(key,rooms,visited);
            }

        }
    }
}