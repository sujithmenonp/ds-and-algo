package BitWiseOperators;

import java.util.Scanner;

public class PowerOfTwo {
    public static   void main(String[] args){
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        System.out.println(powerOfTwo.isPowerOf2(6));
    }
    private  boolean isPowerOf2(int n){
        return (n!=0) && ((n&(n-1)) ==0);
    }
}
