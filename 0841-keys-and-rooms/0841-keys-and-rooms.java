class Solution {
    public void bfs(int start, List<List<Integer>> rooms, boolean[] vis) {
        Queue<Integer> q =new LinkedList<>();
        q.add(start);
        vis[start] =true;

        while(q.size() >0){
            int front =q.remove();
            for(int x :rooms.get(front)){
                if(!vis[x]){
                    vis[x] =true;
                    q.add(x);
                }
            }
        }

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        bfs(0, rooms, vis);
        for (boolean e : vis) {
            if (e == false) {
                return false;
            }
        }
        return true;

    }
}