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
    public void flatten(TreeNode root) {

    	Deque<TreeNode> stack = new ArrayDeque<>();

    	TreeNode node;
    	TreeNode node1 = root;

    	while(!stack.isEmpty() && node1 != null){
    		while(node1 != null){
    			node.left = node1;
    			stack.addFirst(node1);
    			node1 = node1.left;
    		}
    		node1 = stack.removeFirst();
    		node1 = node1.right;
    	}
    	
    	node = root;
    	node1 = root;
    	while(node.left != null){
    		node = node.left;
    		node1.right = node;
    	}
    }
}