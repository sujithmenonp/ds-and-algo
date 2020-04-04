package Array;

import java.util.Stack;

/*
An element is called the leader of an array if there is no element greater than it on the right side.
 */
public class LeadersInArray {
    public static void main(String[] args) {
        LeadersInArray obj = new LeadersInArray();
        int[] a ={1 ,3 ,10, 2, 9, 6};
        obj.solve(a);
        System.out.println();
    }

    private void solve(int[] a) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        if(a==null || a.length==0) return ;
        for(int i=a.length-1;i>=0;i--){
            if(a[i] >max){
                stack.push(a[i]);
                max = a[i];
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+ " ");
        }
    }
}
