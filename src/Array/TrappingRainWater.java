package Array;
/*
https://practice.geeksforgeeks.org/problems/trapping-rain-water/1/?track=SPCF-Arrays&batchId=155
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        TrappingRainWater obj = new TrappingRainWater();
        int[] a = {4,2,3,4,1,2};
        System.out.println(obj.solve2(a));
    }
/*
*       -
* -     -
* -   - -
* - - - -   -
* - - - - - -
 */

    private int solve2(int[] a){
        int n = a.length;
        int s=0;
        int[] lmax = new int[a.length-1];
        int[] rmax = new int[a.length-1];
        lmax[0]=a[0];
        for(int i=1;i<lmax.length;i++){
            lmax[i] = Math.max(lmax[i-1],a[i]);
        }
        rmax[rmax.length-1] = a[n-1];
        for(int j=rmax.length-2;j>0;j--){
            rmax[j] = Math.max(rmax[j+1],a[j]);
        }
        for(int i=1;i<n-1;i++){
            if(a[i] < lmax[i] && a[i] < rmax[i] ) {
                s+= Math.min(lmax[i], rmax[i])-a[i];
            }
        }
        return s;
    }
    private int solve1(int[] a) {
        int n = a.length;
        int s=0;
        for(int i=1;i<n-1;i++){
            int lmax = a[i];
            for(int j=i-1;j>=0;j--){
                lmax= Math.max(lmax,a[j]);
            }
            int rmax = a[i];
            for(int k=i+1;k<n;k++){
                rmax= Math.max(rmax,a[k]);
            }
            if(a[i]<lmax && a[i] <rmax){
                s+=(Math.min(lmax,rmax)-a[i]);
            }
        }
        return s;
    }
}
