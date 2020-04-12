package Recursion;

public class BinomialCoefficient {
    public static void main(String[] args) {
        BinomialCoefficient obj = new BinomialCoefficient();
        System.out.println(obj.solve1(5,3));
    }


    private int solve1(int n, int k) {
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            dp[i][0]=1;
            dp[i][1]=i;
            dp[i][i]=1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        return dp[n][k];
    }
}
