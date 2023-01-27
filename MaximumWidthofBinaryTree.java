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
    public int widthOfBinaryTree(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<>();
	
		Queue<Integer> queueIndex = new LinkedList<>();
		
		queue.add(root);
		queueIndex.add(1);
		
		int width = 0;

		//do level order traversal
		while (!queue.isEmpty()) {
			int size = queue.size();
			
			int start = 0;
			
			int end = 0;
			for (int i = 0; i < size; i++) {
			
				TreeNode node = queue.poll();
				int index = queueIndex.poll();
				
				if (i == 0) {
				
					start = index;
				}
			
				if (i == size - 1) {
					end = index;
				}
			
				if (node.left != null) {
					queue.add(node.left);
					queueIndex.add(index * 2);
				}
			
				if (node.right != null) {
					queue.add(node.right);
					queueIndex.add(index * 2 + 1);
				}
			}
			
			width = Math.max(width, end - start + 1);
		}
		
		return width;
	}
}
