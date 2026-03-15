package Stack_Queues;

import java.util.*;

class DFS {
    private int V;
    private List<List<Integer>> adj;

    DFS(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());
    }

    void addEdge(int u, int v) {
        adj.get(u).add(v);
        // adj.get(v).add(u); // uncomment for undirected graph
    }

    void dfs(int start) {
        boolean[] visited = new boolean[V];
        dfsUtil(start, visited);
    }

    void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);

        g.dfs(0);
    }
}
