package Array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args){
        RemoveDuplicatesFromSortedArray obj = new RemoveDuplicatesFromSortedArray();
        int[] a = {10, 20, 20, 30, 40, 50};
        obj.solve(a);
        System.out.println(Arrays.toString(a));
    }
    private void solve(int[] a){
        if(a==null || a.length==0) return ;

        int l = 0;
        for(int i=1;i<a.length;i++){
            if(a[i] !=a[l]){
                l++;
                a[l] = a[i];
            }
        }
        for(int i=l+1;i<a.length;i++){
            a[i]=Integer.MAX_VALUE;
        }

    }
}
