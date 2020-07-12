package company.amazon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinCostToCutRopes {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 5, 10, 35, 89}));
    }

    private static int solve(int[] a) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int c: a) {
            pq.add(c);
        }
        int sum=0;
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();

            sum+=x+y;
            pq.add(x+y);
        }
        return sum;
    }
}
