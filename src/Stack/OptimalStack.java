package Stack;


import java.util.ArrayList;
import java.util.List;

public class OptimalStack {
    public static void main(String[] args) {
        OptimalStack obj = new OptimalStack();
        obj.solve();
    }

    private void solve() {
        MinStack stack = new MinStack();
        //["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
        //[[],[2],[0],[3],[0],[],[],[],[],[],[],[]]
        stack.push(512);
        stack.push(-1024);
        stack.push(-1024);
        stack.push(512);

        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.getMin());
    }
}
class MinStack {

    List<Integer> a= new ArrayList<>();
    List<Integer> min= new ArrayList<>();
    int topA;
    int topMin;

    /** initialize your data structure here. */
    public MinStack() {
        topA=-1;
        topMin=-1;
    }

    public void push(int x) {
        topA++;
        a.add(topA,x);

        if(topMin==-1 || x <= min.get(topMin)){
            topMin++;
            min.add(topMin,x);
        }
    }

    public void pop() {
        if(a.get(topA).equals(min.get(topMin))){
            topMin--;
        }
        topA--;
    }

    public int top() {
        return a.get(topA);
    }

    public int getMin() {
        return min.get(topMin);
    }
}
