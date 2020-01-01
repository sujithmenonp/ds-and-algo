package Array;

public class SearchInRotateSortedArray {
    public static void main(String[] args){
        SearchInRotateSortedArray s = new SearchInRotateSortedArray();
        int[] a = new int[]{2,3,4,5,6,7,1};
        System.out.println(s.search(a,1));
    }
    private int search(int[] a, int k){
        int pi = findPivot(a,0,a.length-1);
        if(pi==-1)return binarySearch(a,0,a.length-1,k);
        else if(k < a[0])return binarySearch(a,pi+1,a.length-1,k);
        else return  binarySearch(a,0,pi,k);
    }
    private int findPivot(int[] a, int l, int h){
        if(l> h) return -1;
        if(l==h) return l;
        int m = (l+h)/2;
        if(m<h) if(a[m] > a[m+1]) return m;
        if(m>l) if(a[m-1] > a[m] ) return m-1;
        if(a[m]> a[l]) return findPivot(a,m+1,h);
        else return findPivot(a,l,m-1);
    }
    private int binarySearch(int[] a, int l, int h, int k){
        if(l>=h) return -1;
        int m = (l+h)/2;
        if(k < a[m]) return binarySearch(a,l,m-1,k);
        else if(k > a[m]) return binarySearch(a,m+1,h,k);
        else return m;
    }
}
