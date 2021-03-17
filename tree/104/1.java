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
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return searchDepth(root, 1, 1);
    }

    public int searchDepth(TreeNode node, int n, int max){
        if(node == null)
            return max;

        if(n > max){
            max = n;
        }

        int n1 = searchDepth(node.right, n + 1, max);
        int n2 = searchDepth(node.left, n + 1, max);
        max = max > n1? max:n1;
        max = max > n2? max:n2;
        return max;
    }
}