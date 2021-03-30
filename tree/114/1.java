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
//前序遍历：O(n),O(n)
class Solution {
    public void flatten(TreeNode root) {

        if(root == null)
            return;
        List<TreeNode> list = new ArrayList<>();
        
        searchPreOrder(root, list);
        root.left = null;
        for(int i = 1; i < list.size(); i++){
            TreeNode node1 = list.get(i);
            TreeNode node2 = list.get(i - 1);
            node2.left = null;
            node2.right = node1;
        }

    }

    public void searchPreOrder(TreeNode node, List<TreeNode> list){
        if(node == null)
            return;

        list.add(node);
        searchPreOrder(node.left, list);
        searchPreOrder(node.right, list);
    }
}