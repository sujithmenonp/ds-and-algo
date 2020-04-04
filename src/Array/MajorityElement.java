package Array;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement obj = new MajorityElement();
        int[] a = {1,2,2,3,4,5,2,2,2};
        System.out.println(obj.solve(a));
    }

    private int solve(int[] a) {
        int candidate=a[0];
        int cur_sum=1;

        for(int i=1;i<a.length;i++){
            if(a[i]== candidate) cur_sum++;
            else {
                cur_sum--;
                if(cur_sum==0){
                    candidate=a[i];
                    cur_sum=1;
                }
            }
        }

        int c=0;
        for(int i=0;i<a.length;i++){

            if(a[i]==candidate) c++;

        }
        if(c >(a.length)/2)
            return candidate;
        else return -1;

    }
}
