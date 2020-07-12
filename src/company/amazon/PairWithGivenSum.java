package company.amazon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenSum {
    public static void main(String[] args) {

        int[] a = new int[]{20, 50, 40, 25, 30, 10 };
        int[] r = solve(a, 90);
        System.out.println(r[0] + " ," + r[1]);
    }

    private static int[] solve(int[] a, int target) {

        target-=30;
        Map<Integer,Integer> map = new HashMap<>();
        int largest=0;
        int[] r = new int[2];
        r[0]=-1;
        r[1]=-1;
        for(int i=0;i<a.length;i++){
            int complement = target - a[i];
            if((complement>largest || a[i]>largest )&& map.containsKey(complement)){
                r[0] = map.get(complement);
                r[1]=i;
                largest = Math.max(complement,largest);
            }
            map.put(a[i],i);
        }
        return r;
    }
}
