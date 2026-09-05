class Solution {
    public void dfs(int[][] graph, int curr, boolean vis[]) {
        vis[curr] = true;
        for (int i = 0; i < graph.length; i++) {
            if (graph[curr][i] == 1 && !vis[i]) {
                dfs(graph, i, vis);

            }
        }
    }

    public int findCircleNum(int[][] graph) {
        boolean vis[] = new boolean[graph.length];
        int count=0;

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis);
                count++;
            }
        }
        return count;

    }
}