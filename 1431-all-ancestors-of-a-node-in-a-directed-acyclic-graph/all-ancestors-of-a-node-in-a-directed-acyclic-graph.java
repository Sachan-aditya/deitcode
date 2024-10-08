class Solution {
    public List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        int indegree[] = new int[n];
        for (int edge[] : edges) {
            indegree[edge[1]]++;
            graph.get(edge[0]).add(edge[1]);
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }
        int[][] ancestor = new int[n][n];
        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int nei : graph.get(curr)) {
                for (int i = 0; i < n; i++) {
                    if (ancestor[curr][i] == 1 || i == curr) {
                        ancestor[nei][i] = 1;
                    }
                }
                if (--indegree[nei] == 0)
                    q.add(nei);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (ancestor[i][j] == 1)
                    sub.add(j);
            }
            res.add(sub);
        }
        return res;
    }
}