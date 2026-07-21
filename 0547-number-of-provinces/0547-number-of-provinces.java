class Solution {
    public void bfs(boolean[] visited, int[][] graph, int i){
        visited[i] = true;
        int n=graph.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);

        while(q.size() >0){
            int front =q.remove();
            for(int j=0;j<n;j++){
                if(graph[front][j] ==1 && visited[j] ==false){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int n=arr.length; //row here n*n so same thing
        int count =0;
        boolean [] vis =new boolean [n];
        for(int i=0;i<n;i++){
            if( !vis[i]){
                bfs(vis,arr,i);
                count++;
            }
        }
        return count;

        
    }
}