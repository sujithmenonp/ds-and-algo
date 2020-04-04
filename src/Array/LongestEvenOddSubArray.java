package Array;
/*
An interesting array problem to find the length of the longest subarray that has alternating even odd elements.
 */
public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        LongestEvenOddSubArray obj = new LongestEvenOddSubArray();
        int[] a={10,12,14,7,8};
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {
        int max=1; int c=1;
        for(int i=1;i<a.length;i++){
            if((a[i]%2==0 && a[i-1]%2==1) || (a[i]%2==1 && a[i-1]%2==0)){
                c++;
                max = Math.max(c,max);
            }else{
                c=1;
            }
        }
        return max;
    }
}
