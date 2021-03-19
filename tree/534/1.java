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
    public int diameterOfBinaryTree(TreeNode root) {

    	Deque<TreeNode> stack = new ArrayDeque<>();
    	int number = 0;
    	int maxValue;
    	while(root != null || !stack.isEmpty()){
    		while(root != null){
    			stack.addFirst(root);
    			number++;
    			maxValue = Math.max(maxValue, number);
    			root = root.left;
    		}

    		root = stack.removeFirst();
    		number--;
    		root = root.left;
    	}
    	return maxValue;
    }
}