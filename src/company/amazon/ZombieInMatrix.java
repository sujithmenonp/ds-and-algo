package company.amazon;

import java.util.LinkedList;
import java.util.Queue;

public class ZombieInMatrix {
    public static void main(String[] args) {
       int[][] a = new int[][]{ {0, 1, 1, 0, 1},
               {0, 1, 0, 1, 0},
               {0, 0, 0, 0, 1},
               {0, 1, 0, 0, 0}};
        System.out.println(solve(a));
    }

    private static int solve(int[][] a) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

        Queue<int[]> q = new LinkedList<>();

        int cnt=0;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]==1){
                    cnt++;
                    q.add(new int[]{i,j});
                }
            }
        }
        int res=0;
        if(rows*cols==cnt) return res;

        while (!q.isEmpty()){
            int size = q.size();
            if(cnt==rows*cols) return res;
            for(int i=0;i<size;i++) {
                int[] cur = q.poll();
                for (int[] d : directions) {
                    int newX = cur[0] + d[0];
                    int newY = cur[1] + d[1];
                    if (isValid(newX, newY, rows, cols) && a[newX][newY] == 0) {
                        q.add(new int[]{newX, newY});
                        cnt++;
                        a[newX][newY]=1;
                    }
                }
            }
            res++;
        }
        return res;
    }
    private static boolean isValid(int row, int col, int m, int n){
        return row>=0 && row<m && col>=0 && col<n;
    }
}
