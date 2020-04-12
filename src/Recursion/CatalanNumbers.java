package Recursion;

public class CatalanNumbers {
    public static void main(String[] args) {
        CatalanNumbers obj = new CatalanNumbers();
        System.out.println(obj.solve(4));
    }

    private int solve(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];
    }
}
