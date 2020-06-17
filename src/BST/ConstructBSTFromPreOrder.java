package BST;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class ConstructBSTFromPreOrder {
    public static void main(String[] args){

        int[] a = {8,5,1,7,10,12};
        ConstructBSTFromPreOrder obj = new ConstructBSTFromPreOrder();
        TreeNode head  = obj.bstFromPreorder(a);
    }


    public TreeNode bstFromPreorder(int[] preorder) {

        if(preorder.length==0) return null;

        TreeNode root = new TreeNode(preorder[0]);

        if(preorder.length==1) return root;

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        bst(root, min, max, preorder);

        return root;
    }
    static int index=1;
    private void bst(TreeNode root, int min, int max, int[] preorder){

        if(preorder.length==index) return ;

        if(preorder[index] <min || preorder[index]>max) return;

        if(preorder[index] < root.val){
            TreeNode cur_node = new TreeNode(preorder[index]);
            root.left = cur_node;
            index++;
            bst(root.left, min, root.val-1, preorder);
        }

        if(preorder.length==index) return ;
        if(preorder[index] <min || preorder[index]>max) return;

        if(preorder[index] > root.val){
            TreeNode cur_node = new TreeNode(preorder[index]);
            root.right = cur_node;
            index++;
            bst(root.right,root.val+1,max, preorder);
        }

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}