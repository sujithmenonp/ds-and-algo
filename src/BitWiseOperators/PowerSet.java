package BitWiseOperators;

public class PowerSet {
    public static void main(String[] args){

        powerSet("abc");
    }
    private static void powerSet(String s){

        int l = s.length();
        int p = (int)Math.pow(l,2);
        for(int i=0;i<p;i++){
            for(int j=0;j<l;j++){
                if ( (i & (1<<j)) !=0 ) System.out.print(s.charAt(j));
            }
            System.out.println();
        }

    }
}
