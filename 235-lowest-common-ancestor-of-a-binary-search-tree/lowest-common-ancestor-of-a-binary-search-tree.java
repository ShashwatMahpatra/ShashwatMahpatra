/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public static TreeNode ancestorHelper(TreeNode root, TreeNode p , TreeNode q){
        if(root==null) return root;
        while(root!=null){
            if(p.val==root.val|| q.val == root.val) return root;
            else if(p.val<root.val && q.val > root.val) return root;
            else if(p.val>root.val && q.val< root.val)return root;
            else if(p.val<root.val && q.val<root.val)root = root.left;
            else if (p.val>root.val && q.val>root.val)root = root.right;
        }
        return root;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return ancestorHelper(root,p,q);
    }
}