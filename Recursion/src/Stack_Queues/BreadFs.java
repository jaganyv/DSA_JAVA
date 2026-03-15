package Stack_Queues;

import java.util.*;

public class BreadFs {

    // Number of vertices
    private int V;

    // Adjacency list
    private ArrayList<ArrayList<Integer>> adj;

    // Constructor
    public BreadFs(int V) {
        this.V = V;
        adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge (undirected graph)
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    // BFS traversal from given source
    public void bfsTraversal(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS
        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            // Visit all neighbors
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        BreadFs graph = new BreadFs(6);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        // Perform BFS
        graph.bfsTraversal(0);
    }
}

