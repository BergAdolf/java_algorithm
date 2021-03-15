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
//递归法
//时间复杂度：O(n)
//空间复杂度：O(n)
class Solution {
    public boolean isValidBST(TreeNode root) {
        return isValidTree(root, null, null);
    }
    public boolean isValidTree(TreeNode node, Integer high, Integer low){
    	
    	if(node == null)
    		return true;

    	if(high != null && node.val >= high)
    		return false;
    	if(low != null && node.val <= low)
    		return false;
    	/*
    	if(node.left != null)
    		return isValidTree(node.left, node.val, low);
    	if(node.right != null)
    		return isValidTree(node.right, high, node.val);*///如果这样的话会忽略右边子树
    	if(!isValidTree(node.left, node.val, low)) return false;
    	if(!isValidTree(node.right, high, node.val)) return false;

    	return true;
    }
}