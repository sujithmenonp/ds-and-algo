package BitWiseOperators;
//You are given two numbers A and B. Write a program to count number
// of bits needed to be flipped to convert A to B.

public class BitDifference {

    public static void main(String[] args){
        BitDifference bitDifference = new BitDifference();
        System.out.println(bitDifference.perform(25,20));
    }
    public static int perform(int a, int b){
        int xor = a^b;
        return CountSetBits.count1(xor);
    }
}
