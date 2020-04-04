package Array;

import java.util.Arrays;

public class LeftRotateAnArray {
    public static void main(String[] args) {
        LeftRotateAnArray obj = new LeftRotateAnArray();
        int[] a ={ 3, 6,1, 4, 9};
        obj.solve(a, 2);
        System.out.println(Arrays.toString(a));
    }

    private void solve(int[] a, int k) {
        // 3 6 1 4 9
        // 6 1 4 9 3
        // 1 4 9 3 6
        //O(k) + O(n-k) + O(n) = O(n)
        int n =a.length;
        k= k%n;
        reverse(a, 0, k-1);
        reverse(a,k, n-1);
        reverse(a,0,n-1);
    }
    private void reverse(int[] a,int s,  int e){
        while(s<e){
            int t = a[s];
            a[s] = a[e];
            a[e] =t;
            s++;
            e--;
        }
    }
}
