package Array;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        ConsecutiveOnes obj = new ConsecutiveOnes();
        int[] a={1,1,0,1,0,1,1,1,1};
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {
        int cs=0, max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                cs++;
                max =Math.max(max,cs);
            }else{
                cs=0;
            }
        }
        return max;
    }
}
