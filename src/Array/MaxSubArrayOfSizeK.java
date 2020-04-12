package Array;

public class MaxSubArrayOfSizeK {
    public static void main(String[] args) {
        MaxSubArrayOfSizeK obj = new MaxSubArrayOfSizeK();
        int[] a ={ 1,3,8,5,2,9};
        int k=3;// 13, k==3 //16

        System.out.println(obj.solve(a,k));
    }

    private int solve(int[] a, int k) {

        int sum = a[0];
        for(int i=1;i<k;i++){
            sum+=a[i];
        }
        int max = sum;
        for(int i=k;i<a.length;i++){
            sum += (a[i]-a[i-k]);
            max = Math.max(sum,max);
        }
        return max;
    }
}
