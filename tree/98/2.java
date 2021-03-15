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
//中序遍历法
//时间复杂度：O(n)
//空间复杂度：O(1)
class Solution {
    public boolean isValidBST(TreeNode root) {
       
    	Deque<TreeNode> stack = new ArrayDeque<>();
    	TreeNode node = root;
    	Double order = - Double.MAX_VALUE;
    	//Boolean flag = true;
    	while(!stack.isEmpty() || node != null){
    		while(node != null){
    			stack.addFirst(node);
    			node = node.left;
    		}
 			node = stack.removeFirst();

 			if(order >= node.val){
 				return false;
 			}
 			
 			order = (double)node.val;		
 			node = node.right;
    	}
        return true;
    }
}