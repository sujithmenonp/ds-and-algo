package company.amazon;

import java.util.Arrays;

public class UniquePairs {
    public static void main(String[] args)
    {
        int[] a = new int[]{1, 5, 1, 5};
        int target = 6;
        System.out.println(solve(a,target));
    }

    private static int solve(int[] a , int target) {
        Arrays.sort(a);
        int previ=-1,prevj=-1;
        int count=0;
        for(int i=0, j= a.length-1; i<j;){
            if(a[i]+a[j]==target){
                if(isPrevDiff(a, i,j, previ, prevj)) {
                    count++;
                    previ=i;
                    prevj=j;
                }
                i++;
                j--;
            }else if (a[i]+a[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return count;
    }

    private static boolean isPrevDiff(int[] a, int i, int j, int previ, int prevj){
        return (previ==-1 && prevj==-1) || !(a[previ]==a[i] && a[prevj]==a[j]);
    }
}
