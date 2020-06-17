package DP;

public class Combinationsum {
    public static void main(String[] args) {
        Combinationsum obj = new Combinationsum();
        int[] nums = {1,2,3};
        int n=4;
        System.out.println(obj.solve(nums,n));
    }

    private int solve(int[] nums, int n) {
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++) {
            for (int x : nums) {
                if(i >=x)
                dp[i] = dp[i] + dp[i - x];
            }
        }
        return dp[n];
    }
}
