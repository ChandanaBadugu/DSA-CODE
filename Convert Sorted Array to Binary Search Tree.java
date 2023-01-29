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
  public TreeNode sortedArrayToBST(int[] nums) {
    return findout(nums, 0, nums.length-1);
  }

  private TreeNode findout(int[] nums, int l, int r){
    if (l>r) return null;
    if (l==r) return new TreeNode(nums[l]);

    int mid = (l+r)/2;
    
    TreeNode root = new TreeNode(nums[mid]);
    root.left = findout(nums, l, mid-1);
    root.right = findout(nums, mid+1, r);
    return root;
  }
}
