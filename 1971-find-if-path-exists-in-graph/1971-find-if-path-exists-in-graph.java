class Solution {
    public boolean bfs(int source, int destination, ArrayList<Integer>[] graph, int n) {

        boolean vis[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source] = true;

        while (q.size() > 0) {
            int front = q.poll();

            if (front == destination) {
                return true;
            }
            for (int neighbour : graph[front]) {
                if (!vis[neighbour]) {
                    q.add(neighbour);
                    vis[neighbour] = true;
                }
            }
        }
        return false;
    }

    public ArrayList<Integer>[] createGraph(int n, int[][] edges) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph[u].add(v);
            graph[v].add(u);
        }

        return graph;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        ArrayList<Integer>[] graph = createGraph(n, edges);

        return bfs(source, destination, graph, n);
    }
}