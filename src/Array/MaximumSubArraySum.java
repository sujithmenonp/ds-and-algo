package Array;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        MaximumSubArraySum obj = new MaximumSubArraySum();
        int[] a = {2,3,-8,7, -1,2,3};
        System.out.println(obj.solve(a));
    }
/*
kadane's algo
 */
    private int solve(int[] a) {
        if(a==null || a.length==0) return -1;
        int cur_sum=a[0];
        int max = a[0];
        for(int i=1;i<a.length;i++){
            cur_sum = Math.max(a[i],a[i]+cur_sum);
            max = Math.max(cur_sum,max);
        }
        return max;
    }
}
