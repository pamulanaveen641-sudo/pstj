import java.util.*;

public class task8 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            // Graph representation
            List<List<Integer>> graph = new ArrayList<>();

            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            // Read roads
            for (int i = 0; i < m; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();

                graph.get(u).add(v);
                graph.get(v).add(u);
            }

            // Source and destination
            int source = sc.nextInt();
            int destination = sc.nextInt();

            // BFS
            boolean[] visited = new boolean[n + 1];
            Queue<Integer> queue = new LinkedList<>();

            queue.add(source);
            visited[source] = true;

            boolean found = false;

            while (!queue.isEmpty()) {

                int current = queue.poll();

                if (current == destination) {
                    found = true;
                    break;
                }

                for (int next : graph.get(current)) {
                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}