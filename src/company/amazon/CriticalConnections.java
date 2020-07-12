package company.amazon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CriticalConnections {
    int time=0;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer>[] graph = new List[n];
        buildGraph(n, connections, graph);

        int[] parents = new int[n];
        int[] low = new int[n];
        int[] disc =new int[n];

        Arrays.fill(parents,-1);
        Arrays.fill(low,-1);
        Arrays.fill(disc,-1);

        for(int i=0;i<n;i++){
            if(disc[i]==-1){
                dfs(i,disc,low,parents,res,graph);
            }
        }
        return res;
    }
    private void dfs(int u, int[] disc, int[] low, int[] parents, List<List<Integer>> res, List<Integer>[] graph){

        if(disc[u]!=-1) return ;

        disc[u]= low[u]=time++;

        for(int v: graph[u]){
            if(disc[v] ==-1){
                parents[v]=u;
                dfs(v,disc,low,parents,res,graph);
                low[u] = Math.min(low[u],low[v]);
                if(low[v] >disc[u]){
                    res.add(Arrays.asList(u,v));
                }
            }else if(parents[u]!=v){
                low[u]=Math.min(low[u],disc[v]);
            }
        }
    }
    private void buildGraph(int n, List<List<Integer>> connections, List<Integer>[] graph){
        for(List<Integer> c: connections){
            int u = c.get(0);
            int v = c.get(1);
            if(graph[u]==null){
                graph[u] = new ArrayList<>();
            }
            if(graph[v]==null){
                graph[v]= new ArrayList<>();
            }
            graph[u].add(v);
            graph[v].add(u);
        }
    }
}