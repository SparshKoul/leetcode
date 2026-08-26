class Solution {
    public void bfs(boolean[] visited,int[][] isConnected, int startcity){
        Queue<Integer> q = new LinkedList<>();
        int n =isConnected.length;
        q.add(startcity);
        visited[startcity] =true;

        while(q.size() >0){
            int front =q.remove();
            for(int j=0;j<n;j++){
                if(isConnected[front][j] ==1 && visited[j] ==false){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length; //row here n*n so same thing
        int count =0;
        boolean [] vis =new boolean [n];
        for(int i=0;i<n;i++){
            if( !vis[i]){
                bfs(vis,isConnected,i);
                count++;
            }
        }
        return count;
        
    }
}