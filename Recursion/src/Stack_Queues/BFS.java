package Stack_Queues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public static void bfs(int V, List<List<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        visited[0] = true;
        queue.offer(0);

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.println(node + " ");

            for(int nei : adj.get(node)){
                if(!visited[nei]){
                    visited[nei] = true;
                    queue.offer(nei);
                }
            }
    }
    }
    public static void main(String[] args) {
        int V = 6;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(5);

        bfs(V, adj);
    }
}
