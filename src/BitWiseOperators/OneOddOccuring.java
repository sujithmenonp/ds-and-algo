package BitWiseOperators;

public class OneOddOccuring {
    public static void main(String[] args){
        OneOddOccuring oneOddOccuring = new OneOddOccuring();
        oneOddOccuring.find(new int[]{2,2,2,2,5,6,7,6,7});
    }
    private void find(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s^=a[i];
        }
        System.out.println(s);
    }
}
