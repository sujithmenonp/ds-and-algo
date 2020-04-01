package BitWiseOperators;

public class TwoOddOccuring {
    public static void main(String[] args){
        TwoOddOccuring twoOddOccuring = new TwoOddOccuring();
        twoOddOccuring.find(new int[]{2,2,2,2,3,3,3,3,3,6,7,6,7,9,9,9});
    }
    private void find(int[] a){
        int xor=0;
        for(int i=0;i<a.length;i++){
            xor^=a[i];
        }
        int f = xor & (~(xor-1));
        int fo=0, so=0;
        for(int i=0;i<a.length;i++){
            if((f & a[i]) == 0){
                fo ^=a[i];
            }else{
                so ^=a[i];
            }
        }
        System.out.println(fo);
        System.out.println(so);
    }
}
