package Array;

import java.util.Scanner;

//https://www.geeksforgeeks.org/number-subsequences-form-ai-bj-ck/
public class FindSubsequence {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(solve(s));
    }
    public static int solve(String s){

        int aCount=0, bCount=0, cCount=0;
        for(int i=0;i< s.length();i++){


            Character c = s.charAt(i);
            switch (c){
                case 'a':
                    aCount = 1 + 2*aCount;
                    break;
                case 'b':
                    bCount = aCount + 2*bCount;
                    break;
                case 'c':
                    cCount = bCount + 2*cCount;
            }
        }
        return cCount;
    }
}
