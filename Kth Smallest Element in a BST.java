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
    ArrayList<Integer> li=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root==null){
            return 0;
        }

        inorder(root,k);
        
        return li.get(k-1);
    }

    public void inorder(TreeNode root,int k){

    if(root==null){
        return ;
    }

    inorder(root.left,k);
    li.add(root.val);
    if(li.size()==k){
        return ;
    }
    inorder(root.right,k);
    }
}
