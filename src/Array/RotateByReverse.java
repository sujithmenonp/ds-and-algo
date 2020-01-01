package Array;

import java.util.Arrays;

public class RotateByReverse {
    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4,5,6};
        int d=2;
        RotateByReverse r = new RotateByReverse();
        r.reverse(a,0,d-1);
        r.reverse(a,d,a.length-1);
        r.reverse(a,0,a.length-1);

        System.out.println(Arrays.toString(a));
    }
    private void reverse(int[] a, int s, int e){
        for(int i=s , j=e ;i<=j;i++,j--){
            int temp = a[i];
            a[i] = a[j];
            a[j]= temp;
        }
    }
}
