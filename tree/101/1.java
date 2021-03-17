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
 * }中序遍历方法，忽略到相同结点值相同的情况下，是对的。
 */

class Solution {
    public boolean isSymmetric(TreeNode root) {

    	if(root == null)
    		return true;

    	List<Integer> list = new ArrayList<>();
    	Stack<TreeNode> stack = new Stack<>();
    	TreeNode node = root;
    	Boolean flag = true;

    	while(node!= null || !stack.isEmpty()){ //进行中序遍历
    		while(node != null){
    			stack.push(node);
    			node = node.left;
    		}
    		node = stack.pop(); //从堆栈中取出最后一个结点

    		if(flag){
    			if(node == root){//在中间弹出来的点是root
    				flag = false;
    			}
    			else{
	    			list.add(node.val);
    			}
    		}
    		else{
    			if(list.isEmpty() || list.remove(list.size() - 1) != node.val){
                    return false;
    			}
    		}	
    		node = node.right;
    	}
    	return true;

    }
}