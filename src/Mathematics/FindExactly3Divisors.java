package Mathematics;
/*
*Given a positive integer value N. The task is to find how many numbers less
 *  than or equal to N have numbers of divisors exactly equal to 3.
 */
public class FindExactly3Divisors {
    public static void main(String[] args){

        findDivisor(25  );
    }
    private static void findDivisor(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){

            if(isPrime(i)) count++;
        }
        System.out.println(count);
    }
    private static boolean isPrime(int n){

        if(n<=1) return false;
        if (n==2|| n==3) return true;

        if(n%2==0 || n%3==0) return false;
        for(int i=5;i*i<n;i+=6){
            if(n%i==0 || n%(i+2)==0) return false;
        }
        return true;
    }
}
