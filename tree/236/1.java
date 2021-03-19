/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 //时间复杂度: O(n)
 //空间复杂度：O(n)

class Solution {
    TreeNode node;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        findFatherNode(root, p, q);
        return node;
    }

    public boolean findFatherNode(TreeNode root, TreeNode p, TreeNode q){
        if(root == null)
            return false;
        boolean b3 = false;
        if(root == p || root == q)
        {
            b3 = true;
        }

        boolean b1 = findFatherNode(root.left, p, q);
        boolean b2 = findFatherNode(root.right, p, q);

        //b1 = b1 || b2;
        if(((b2 == true || b1 == true) && b3 == true) || (b1 == true && b2 == true)){
            node = root;
        }
        return b1 || b2 || b3;
    }

}