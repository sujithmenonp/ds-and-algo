package company.amazon;

import java.util.Arrays;

public class MinCostToConnectAllNodes {
    static int[] parent;
    static int component;
    public static void main(String[] args) {

        int n = 5;
        int[][] edges = new int[][]{
                {1,2},
                {2,3},
                {3,4},
                {4,5},
                {1,5}
        };

        int[][] newEdges = new int[][]{
                {1,2,12},
                {3,4,30},
                {1,5,8}
        };
        System.out.println(solve(n, edges, newEdges));
    }

    private static int find(int x){
        while(x!=parent[x]){
            x = parent[x];
        }
        return x;
    }

    private static void connect(int s, int e){
        int a = find(s);
        int b = find(e);
        if(a==b) return;
        while(parent[e]!=a){
            int temp = parent[e];
            parent[e] = a;
            e = temp;
        }
        --component;
        parent[e]=a;
    }
    private static boolean isConnected(int s, int e){
        return find(s)==find(e);
    }
    private static int solve(int n, int[][] edges, int[][] newEdges) {

        parent = new int[n+1];
        component=n;
        for(int i=1;i<=n;i++){
            parent[i] = i;
        }
        for(int i=0;i<edges.length;i++){
            connect(edges[i][0], edges[i][1]);
        }
        Arrays.sort(newEdges, (a,b)-> (a[2]-b[2]));
        int cost=0;
        for(int i=0;i<newEdges.length;i++){
            if(!isConnected(newEdges[i][0], newEdges[i][1])){
                connect(newEdges[i][0], newEdges[i][1]);
                cost+=newEdges[i][2];
            }
        }
        return cost;
    }
}