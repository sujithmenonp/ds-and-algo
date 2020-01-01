package Array;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args){
        Rotate r = new Rotate();
        int[] a = new int[] { 1, 2,3,4,5,6};
        r.leftRotate(a, a.length,4);
        System.out.println(Arrays.toString(a));
    }
    public void leftRotate(int[] a, int n, int d){
        int gcd = findGCD(n,d);
        for(int i=0;i< gcd; i++){
            int j=i;
            int temp = a[j];
            while (true){
                int k = j+d;
                if(k>=n) k = k-n;
                if(k==i) break;
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
    }

    private int findGCD(int a, int b) {
        if(b==0) return a;
        else return findGCD(b,a%b);
    }
}
