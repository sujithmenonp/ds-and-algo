package Graph;

import java.util.LinkedList;
import java.util.Scanner;

public class TraverseGraphDFS{

    int V;

    LinkedList<Integer> adj[];

    TraverseGraphDFS(int v){
        V=v;
        adj= new LinkedList[V+1];
        for(int i=1;i<=V;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int s, int e){
        adj[s].add(e);
    }

    void dfsUtil(int s, boolean[] visited){

        visited[s] = true;

        LinkedList<Integer> d = adj[s];

        for(int i=0;i<d.size();i++){

            if(!visited[d.get(i)]) {
                dfsUtil(d.get(i), visited);
            }
        }

        System.out.print(s+" ");
    }
    void dfs(int s){

        boolean[] visited = new boolean[V+1];

        dfsUtil(s,visited);

    }

    public static void main(String[] args){

        TraverseGraphDFS graph = new TraverseGraphDFS(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,5);
        graph.addEdge(3,5);
        graph.addEdge(2,4);

        graph.dfs(1);
    }



}
