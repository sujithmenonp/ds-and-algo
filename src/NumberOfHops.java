import java.util.Scanner;

/**
 * Created by admin on 24-02-2017.
 */
public class NumberOfHops {

    public static int getNumberOfHops(int k, int n){
        //Number of hops of size n
        int x = k/n;

        //Number of remaining units
        int y = k%n;

        //Check if (hop down+N unit jump)would be more efficient than moving in units of 1
        if(k%n > (n-k%n)+1){
            y= (n-k%n)+1;
        }
        else{
            //y is already assigned k%n
        }
        return x+y;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //Get length of pole
        int k = sc.nextInt();
        //Get size of hop
        int n = sc.nextInt();

        System.out.println("Min number of hops needed:"+ getNumberOfHops(k,n) );

    }
}
