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
    public boolean isBalanced(TreeNode root) {
    	int t = compareDepthOfTree(root);
    	return t >= 0;
    }


    public int compareDepthOfTree(TreeNode root){
    	if(root == null)
    		return 0;

    	int left = compareDepthOfTree(root.left);
    	int right = compareDepthOfTree(root.right);

    	if(left < 0 || right < 0 || Math.abs(left - right) > 1)
    		return -1;

    	return Math.max(left, right) + 1;
    }
}