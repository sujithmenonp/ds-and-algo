package Array;

import java.util.HashMap;

//https://www.geeksforgeeks.org/largest-subarray-with-equal-number-of-0s-and-1s/
public class LargestSubarray {

    public static void main(String[] args){

        int[] a  = new int[] {0, 0, 1, 1, 0};
        System.out.println(solve(a));
    }
    static int solve(int[] a){

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int max_len=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){

            if(a[i]==0) a[i]=-1;

            sum+=a[i];

            if(sum==0){
                if(max_len < i+1){
                    max_len = i+1;
                }
            }

            if(map.containsKey(sum)){
                if(max_len < i-map.get(sum)+1){
                    max_len = i-map.get(sum)+1;
                }
            }else{
                map.put(sum,i);
            }
        }
        return max_len-1;
    }
}
