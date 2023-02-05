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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> v = new ArrayList<>();
        inorder(root, v);
        int n = v.size();
        int i = 0;
        int j = n - 1;
        while (j > i) {
            if (v.get(i) + v.get(j) == k) {
                return true;
            }
            else if (v.get(i) + v.get(j) > k) {
                 j--;
            }
             else {
                i++;
            }
        }
    return false;
        
    }


    public void inorder(TreeNode root, ArrayList<Integer> v)
    {
    if (root == null) {
      return;
    }
    inorder(root.left, v);
    v.add(root.val);
    inorder(root.right, v);
  }
}
