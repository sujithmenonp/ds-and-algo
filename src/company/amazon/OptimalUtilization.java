package company.amazon;

import javafx.util.Pair;

import java.util.*;

public class OptimalUtilization {
    public static void main(String[] args) {
//a = [[1, 3], [2, 5], [3, 7], [4, 10]]
//b = [[1, 2], [2, 3], [3, 4], [4, 5]]
//target = 10

        int[][] a = new int[][]{{1,8},{2,7},{3,14}};
        int[][] b = new int[][]{{1,5},{2,10},{3,14}};
        List<List<Integer>> re = solve(a,b,20);
        for(List<Integer> r : re){
            System.out.println(r.toString());
        }
    }

    private static List<List<Integer>> solve(int[][] a, int[][] b, int target) {

        Map<Integer, List<List<Integer>>> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){

                int[] ac = a[i];
                int[] bc = b[j];

                if(ac[1]+bc[1]<=target) {
                    List<List<Integer>> cur = map.getOrDefault(ac[1] + bc[1], new ArrayList<>());
                    cur.add(Arrays.asList(i+1, j+1));
                    map.put(ac[1] + bc[1], cur);
                }
            }
        }

        PriorityQueue<Map.Entry<Integer,List<List<Integer>>>> pq =
                new PriorityQueue<>((x,y)->y.getKey() - x.getKey());

        pq.addAll(map.entrySet());

        Map.Entry e = pq.poll();
        List<List<Integer>>  r = (List<List<Integer>>)e.getValue();

        return r;
    }
}
