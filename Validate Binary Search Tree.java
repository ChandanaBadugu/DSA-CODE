/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return checkout(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean checkout(TreeNode root, long minrange ,long maxrange){
        if(root==null){
            return true;
        }

        if(root.val>=maxrange){
            return false;
        }

        if(root.val<=minrange){
            return false;
        }

        return checkout(root.left,minrange,root.val) && checkout(root.right,root.val,maxrange);
    }
}
