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
    Queue<TreeNode> q=new LinkedList <>();
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return ans;
        }
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> levels=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode current=q.poll();
                levels.add(current.val);
                if(current.left!=null){
                    q.offer(current.left);
                }
                if(current.right!=null){
                    q.offer(current.right);
                    
                }
            }
            ans.add(levels);
        }
        return ans;
    }
}