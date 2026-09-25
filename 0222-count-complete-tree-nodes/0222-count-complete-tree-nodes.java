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
    int ans = 0;
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = countleft(root);
        int right = countright(root);

        if(left == right){
            return(1<<left)-1;
        }
        return 1+countNodes(root.left)+countNodes(root.right);
    }
    public int countright(TreeNode root){
        if(root == null){
            return 0;
        }
        int height= 0;
        while(root!=null){
            height +=1;
            root=root.right;
        }
        return height;
    }
    public int countleft(TreeNode root){
        if(root == null){
            return 0;
        }
        int height= 0;
        while(root!=null){
            height +=1;
            root=root.left;
        }
        return height;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna