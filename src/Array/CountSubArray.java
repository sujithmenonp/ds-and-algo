package Array;

import java.util.HashMap;

//https://www.geeksforgeeks.org/count-subarrays-equal-number-1s-0s/
public class CountSubArray {
    public static void main(String[] args){
        int[] a = {1, 0, 0, 1, 0, 1, 1};
        System.out.println(solve(a));
    }
    static int solve(int[] a){

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                a[i]=-1;
            }
            sum+=a[i];
            if(sum==0) count++;
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }else{
                map.put(sum,1);
            }
        }

        for(Integer key: map.keySet()){
            int n = map.get(key);
            if(n>1){
                count += n*(n-1)/2;
            }
        }

        return count;
    }
}
