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

public class Solution {

    int sum = 0;
    
    public TreeNode convertBST(TreeNode root) {
        sumRoot(root);
        return root;
    }
    
    public void sumRoot(TreeNode cur) {
        if (cur == null) {
            return;
        }
            
        sumRoot(cur.right);
        cur.val += sum;
        sum = cur.val;
        sumRoot(cur.left);
    }
    
}
