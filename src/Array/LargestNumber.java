package Array;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNumber {

    class NumberComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }
    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
        int[] A ={3, 30, 34, 5, 9};
        Integer[] a  = new Integer[A.length];
        for(int i=0;i<A.length;i++){
            a[i] = A[i];
        }
        System.out.println(obj.solve(a));
    }

    private String solve(Integer[] a) {
        Arrays.sort(a, (o1, o2) -> {
            String r1 = o1.toString()+o2.toString();
            String r2 = o2.toString()+o1.toString();
            int i1 = Integer.parseInt(r1);
            int i2 = Integer.parseInt(r2);
            return Integer.compare(i1, i2);
        });
        StringBuffer buffer = new StringBuffer();
        for(int i=a.length-1;i>=0;i--){
            buffer.append(a[i]);
        }
        return buffer.toString();
    }
}
