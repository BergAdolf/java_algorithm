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
//递归方法
//时间复杂度：O(n)
//空间复杂度：O(n)
class Solution {
    public TreeNode convertBST(TreeNode root) {

        Deque<TreeNode> stack = new ArrayDeque<>();
        int temp = 0;
        TreeNode node = root;

        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.addFirst(root);
                root = root.right;
            }
            root = stack.removeFirst();
            temp = temp + root.val;
            root.val = temp;
            root = root.left;
        }

        return node;
    }
}