import java.util.Arrays;

//Approach: use 2 pointers. use a slow pointer and fast pointer
//if slow and fast points are different then update the slow point to fast, otherwise skip/
public class RemoveDuplicatesInArray {
    public static void main(String[] args){

        int[] a = new int[]{0,1,1};
        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }

    private static int removeDuplicates(int[] nums){

        if(nums==null || nums.length==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if (nums[i] !=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
