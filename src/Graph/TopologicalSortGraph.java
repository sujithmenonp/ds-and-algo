package Graph;

import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSortGraph {

    int V;

    LinkedList<Integer> adj[];

    TopologicalSortGraph(int v){
        V=v;
        adj= new LinkedList[V+1];
        for(int i=1;i<=V;i++){
            adj[i] = new LinkedList<>();
        }
    }
    void addEdge(int s, int e){
        adj[s].add(e);
    }

    void dfsUtil(int s, boolean[] visited, Stack<Integer> st){

        visited[s] = true;

        LinkedList<Integer> d = adj[s];

        for(int i=0;i<d.size();i++){

            if(!visited[d.get(i)]) {
                dfsUtil(d.get(i), visited, st);
            }
        }

        st.push(s);
    }
    void dfs(int s){
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V+1];
        dfsUtil(s,visited,st);

        while (!st.isEmpty()){
           System.out.print(st.pop()+" ");
        }
    }

    public static void main(String[] args){

        TopologicalSortGraph graph = new TopologicalSortGraph(5);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,5);
        graph.addEdge(3,5);
        graph.addEdge(2,4);

        graph.dfs(1);
    }



}
