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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();

        postOrder(root,li);
        return li;
    }
    public void postOrder(TreeNode root, ArrayList<Integer> li){
        if(root==null){
            return;  
        }
        
        postOrder(root.left,li); 
        
        postOrder(root.right,li); 
        
        li.add(root.val); 
    }
}
