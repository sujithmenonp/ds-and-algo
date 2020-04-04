package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n);
    }
    private static void solve(int n){
        if(n==0 )return;
        solve(n-1);
        System.out.print(n+" ");
    }
}
