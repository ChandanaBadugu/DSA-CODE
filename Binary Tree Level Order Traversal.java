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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li=new LinkedList<>();
        
        if(root==null){
            return li;
        }
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> l=new ArrayList<>();

            int count=q.size();

            for(int i=0;i<count;i++){
                TreeNode cur=q.poll();
                l.add(cur.val);
                
                if(cur.left!=null){
                    q.add(cur.left);
                }

                if(cur.right!=null){
                    q.add(cur.right);
                }
                
            }
            
            li.add(l);
        }
        return li;
    }
}
