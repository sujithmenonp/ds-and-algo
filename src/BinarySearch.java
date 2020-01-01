public class BinarySearch {
    public static void main(String[] args){

        int[] a = new int[] {1,2,3,4};
        int target =3;
       // System.out.println(binarySearch(a,target,0,a.length-1));
        System.out.println(binarySearchIterative(a,target));

    }

    private static int binarySearch(int[] a, int target ,int l, int r) {
        if (l > r) return -1;

        int m = (l + r) / 2;
        if (a[m] == target) return m;
        else if (a[m] < target) return binarySearch(a, target, m + 1, r);
        else return binarySearch(a, target, l, m - 1);

    }
    private static int binarySearchIterative(int[] a, int target){

       int l=0;
       int r = a.length-1;
       int i =-1;

       while (l<=r){
           int m = (l+r)/2;
           if(a[m]==target){ i=m; break;}
           else if(a[m] < target) {
               l = m+1;
           }else{
               r = m-1;
           }
       }
       return i;
    }
}
