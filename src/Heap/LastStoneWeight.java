package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight obj = new LastStoneWeight();
        int[] a = new int[]{6,6,7,7,9};
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<a.length;i++){
            q.add(a[i]);
        }

        while (!q.isEmpty() && q.size()>1){
            int x = q.poll();
            int y = q.poll();
            if(x!=y){
               int t = Math.abs(x-y);
               q.add(t);
            }
        }
        if(q.isEmpty()) return 0;
        else return q.poll();
    }
}
