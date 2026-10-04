class Solution {
    int[] parent, size;
    int components;

    int find(int x) {
        if (parent[x] != x)
        {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int ra = find(a), rb = find(b);
        if (ra == rb)
            return false;
        if (size[ra] < size[rb]) {
            int t = ra;
            ra = rb;
            rb = t;
        }
        parent[rb] = ra;
        size[ra] += size[rb];
        components--;
        return true;
    }

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length; // n edges, n nodes (tree + 1 extra)
        parent = new int[n + 1];
        size = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int[] e : edges){
            if (!union(e[0], e[1])){
                return e;
            }
        }

        return new int[0];
    }
}