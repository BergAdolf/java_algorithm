
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
    public int kthLargest(TreeNode root, int k) {
    	int len = 0;
    	Stack<TreeNode> stack = new Stack<>();
    	while(!stack.isEmpty() || root != null){
    		while(root != null){
    			stack.push(root);
    			root = root.right;
    		}

    		root = stack.pop();
            len++;
            if(len == k){
                break;
            }
    		root = root.left;
    	}

    	return root.val;
    }
}