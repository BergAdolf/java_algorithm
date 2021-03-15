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
//迭代算法

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
       	orderList(root, list);
        return list;
    }
    public void orderList(TreeNode node, List<Integer> list){
    	if(node == null)
    		return;
    	orderList(node.left, list);
    	list.add(node.val);
    	orderList(node.right, list);

    	//return list;
    }
}