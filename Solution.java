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
     int sum;
    public int maxPathSum(TreeNode root) {
        sum = root.val;
        sum(root);
        return sum;
    }
    public int sum(TreeNode root){     
        if(root == null){
            return 0;
        }
        int left = sum(root.left);
        int right = sum(root.right);
        int max = Math.max(left, right);
        sum = Math.max(root.val,Math.max(max + root.val,  Math.max(sum, left + right + root.val)));
         return Math.max(root.val, max + root.val);
    }
}
