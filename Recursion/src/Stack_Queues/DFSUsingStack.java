package Stack_Queues;

import java.util.*;

public class DFSUsingStack {

    private int V;
    private List<List<Integer>> adj;

    // Constructor
    public DFSUsingStack(int V) {
        this.V = V;
        adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge
    void addEdge(int u, int v) {
        adj.get(u).add(v);
        // adj.get(v).add(u); // uncomment for undirected graph
    }

    // DFS using Stack
    void dfs(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                // Push neighbors
                for (int neighbor : adj.get(node)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DFSUsingStack graph = new DFSUsingStack(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("DFS Traversal:");
        graph.dfs(0);
    }
}

