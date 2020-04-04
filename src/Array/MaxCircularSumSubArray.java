package Array;

public class MaxCircularSumSubArray  {
    public static void main(String[] args) {
        MaxCircularSumSubArray obj = new MaxCircularSumSubArray();
        int[] a={8, -4 , 3, -5,4 };
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {

        int normal_max = maxSubArraySum(a);

        if(normal_max<0) return normal_max;

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            a[i]=-a[i];
        }
        int circular_max = sum + maxSubArraySum(a);
        return Math.max(circular_max,normal_max);
    }

    private int maxSubArraySum(int[] a){
        int max =a[0], cur_max=a[0];
        for(int i=1;i<a.length;i++){
            cur_max = Math.max(cur_max+a[i],a[i]);
            max = Math.max(max,cur_max);
        }
        return max;
    }
}
