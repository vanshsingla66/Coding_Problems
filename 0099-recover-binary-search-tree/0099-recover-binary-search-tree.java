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
    TreeNode curr = null;
    TreeNode prev = null;
    TreeNode next = null;
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = curr.val;
        curr.val = next.val;
        next.val = temp;

    }
    public void inorder(TreeNode root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        if(prev!=null && prev.val>root.val){
            if(curr == null){
                curr = prev;
            }
            next = root;

        }
        prev = root;
        inorder(root.right);
    }
}