package company.amazon;

public class TreasureIsland {

    private static int min = Integer.MAX_VALUE;
    private static int[][] d = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public static void main(String[] args) {
        char[][] a = new char[][]{
                {'S', 'O', 'O', 'S', 'S'},
                {'D', 'O', 'D', 'O', 'D'},
                {'O', 'O', 'O', 'O', 'X'},
                {'X', 'D', 'D', 'O', 'O'},
                {'X', 'D', 'D', 'D', 'O'}
        };
        System.out.println(solve(a));
    }

    private static int solve(char[][] a) {

        int rows = a.length;
        if(rows==0) return 0;
        int cols = a[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(a[i][j]=='S') {
                    boolean[][] v = new boolean[rows][cols];
                    dfs(a, v, i, j, 0);
                }
            }
        }

        return min;
    }

    private static void dfs(char[][] a, boolean[][] v, int row, int col, int level){

       // System.out.println("( "+row+" "+ col+" )");
        if(isValid(row,col, a) && !v[row][col]){
            v[row][col] = true;
            if(a[row][col]=='X'){
                min = Math.min(min,level);
            }else if(a[row][col]=='O' || a[row][col]=='S') {
                for (int[] dir : d) {
                    int tr = row + dir[0];
                    int tc = col + dir[1];
                    dfs(a, v, tr, tc, level+1);

                }
            }
            v[row][col]=false;
        }
    }
    private static boolean isValid(int row, int col, char[][] a){
        int rows  = a.length;
        int cols = a[0].length;
        return row >=0 && row<rows && col>=0 && col<cols;
    }
}
