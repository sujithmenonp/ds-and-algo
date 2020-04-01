package BitWiseOperators;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(count1(n));
    }
    private static int count(int n){
        int c=0;
        while (n!=0) {
            if ((n & 1) == 1) {
                c++;
            }
            n = n /2;
        }
        return c;
    }
    //Brian kerningam's
    public static int count1(int n){
        int c=0;
        while(n!=0){
            c++;
            n = n &(n-1);
        }
        return c;
    }
}
