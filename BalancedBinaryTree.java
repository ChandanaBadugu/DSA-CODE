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
    boolean k=true;
    public int  height(TreeNode node){
        if(node==null){
        return 0;
        }


        int l = height(node.left);
        int r = height(node.right);

        if(Math.abs(l-r)>1){
         k=false;
        }
     
    return  Math.max(l,r)+1;
    }


    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        height(root);
    return  k;
    }
}
