package company.amazon;

public class MaxOfMinAltitudes {
    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1, 2, 3},
                {4, 5, 1},
                {3, 2, 7}
        };
        System.out.println(solve(a));
    }


    private static int solve(int[][] a) {

        int rows = a.length;
        if (rows == 0) return 0;
        int cols = a[0].length;
        int[][] dp = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if ((i == 0 && j == 0) || (i == 0 && j == 1) || (i == 1 && j == 0)) {
                    dp[i][j] = a[i][j];
                } else if (i == 0) {
                    dp[i][j] = Math.min(a[i][j - 1], a[i][j]);
                } else if (j == 0) {
                    dp[i][j] = Math.min(a[i][j], a[i - 1][j]);
                } else if (i == rows - 1 && j == cols - 1) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                } else {
                    dp[i][j] = Math.min(a[i][j], Math.max(dp[i][j - 1], dp[i - 1][j]));
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[rows - 1][cols - 1];
    }
}