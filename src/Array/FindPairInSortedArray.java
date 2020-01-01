package Array;

public class FindPairInSortedArray {
    public static void main(String[] args){
        FindPairInSortedArray f = new FindPairInSortedArray();
        int[] a = new int[]{3, 4, 5, 1, 2};
        f.findPair(a, 9);
    }
    private void findPair(int[] a , int s){
        int p = findPivot(a, 0 , a.length-1);
    }
    private int findPivot(int[] a, int l, int h){
        if(l >= h) return -1;
            return -1;
    }
}
