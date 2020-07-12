package company.amazon;

import java.util.ArrayList;
import java.util.List;

public class SubTreeWithMaxAverage {

    private static double max = Double.MIN_VALUE;
    static TreeNode maxNode  = null;
    public static void main(String[] args) {

        TreeNode root = new TreeNode(20);
        TreeNode left = new TreeNode(12);
        root.children.add(left);
        TreeNode right = new TreeNode(18);
        root.children.add(right);

        left.children.add(new TreeNode(11));
        left.children.add(new TreeNode(2));
        left.children.add(new TreeNode(3));

        right.children.add(new TreeNode(15));
        right.children.add(new TreeNode(8));

        solve(root);
        System.out.println(maxNode.val);
    }

    private static void solve(TreeNode root) {
        if(root==null) return;
        helper(root);
    }
    private static int[] helper(TreeNode root){

        if(root==null) return new int[]{0,0};

        int count =1;
        int sum=root.val;
        for(TreeNode child: root.children){
            int[] temp = helper(child);
            count+=temp[0];
            sum+=temp[1];
        }
        double avg = 1.0*sum/count;
        if(count>1 && avg> max){
            max = avg;
            maxNode = root;
        }
        return new int[]{count,sum};
    }

}
class TreeNode{
    List<TreeNode> children;
    int val;
    public TreeNode(int v){
        this.val = v;
        children = new ArrayList<>();
    }
}