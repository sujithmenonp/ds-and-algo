package Recursion;

import java.util.Scanner;

/*
You are given a number n. You need to find the sum of digits of n.
 */
public class SumOfDigits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solve(n));
    }
    private static int solve(int n){
        if(n==0 )return 0;
        return  n%10+solve(n/10);

    }
}
