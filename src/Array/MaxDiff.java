package Array;
/*
Maximum Difference problem is to find the maximum of arr[j] - arr[i] where j>i.
 */
public class MaxDiff {
    public static void main(String[] args) {
        MaxDiff obj = new MaxDiff();
        int[] a={10,21,15,20,5,40,70};
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {
        if(a==null || a.length<=1) return -1;
        int min = a[0], max=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            max = Math.max(max, a[i]-min);
            if(a[i] < min){
                min = a[i];
            }
        }
        return max;
    }
}
