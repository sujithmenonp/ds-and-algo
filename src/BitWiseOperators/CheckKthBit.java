package BitWiseOperators;

import java.util.Scanner;

public class CheckKthBit {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(checkBit(n,k));
    }

    private static boolean checkBit(int n, int k) {
        if((1 << (k - 1) & n) == 0) return false;
        return true;
    }
}
