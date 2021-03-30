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
    public int maxDepth(TreeNode root) {
        return searchMaxDepth(root);
    }

    public int searchMaxDepth(TreeNode root){
        if(root == null)
            return 0;
        int left = searchMaxDepth(root.left);
        int right = searchMaxDepth(root.right);

        return Math.max(left, right) + 1;  
    }
}