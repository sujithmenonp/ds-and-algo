package Mathematics;

public class NumberOfDigits {
    public static void main(String[] args){


        System.out.println("Number of digits in "+2+" ="+numberofDigits(2));
        System.out.println("Number of digits in "+10+" ="+numberofDigits(10));
        System.out.println("Number of digits in "+115+" ="+numberofDigits(115));
        System.out.println("Number of digits in "+2000+" ="+numberofDigits(2000));


        System.out.println("Number of digits in "+2000+" ="+numberOfDigitsInFactorial(5));
    }
    private static int numberofDigits(int a){
        return (int)Math.floor(Math.log10(a)+1);
    }

    private static int numberOfDigitsInFactorial(int n){
        double t = 0d;
        for(int i=1;i<=n;i++){
            t+=Math.log10(i);
        }
        return (int)Math.floor(t+1);
    }
}
