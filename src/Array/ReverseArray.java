package Array;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args){
        int[] a ={1,2,3,4,5};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    private static void reverse(int[] a){
        if(a==null || a.length==0) return;

        int i=0; int j=a.length-1;
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] =t;
            i++;
            j--;
        }
    }
}
