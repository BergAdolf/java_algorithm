//堆栈法
//时间复杂度：O(n)
//空间复杂度：O(n)
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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();

        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            
            if(node.left != null){
                stack.addFirst(node);
                node = node.left;
            }
            else{
                list.add(node.val);

                if(node.right != null){
                    node = node.right;
                }
                else{
                    node = stack.pollFirst();
                    while(node != null && node.right == null){
                        list.add(node.val);
                        node = stack.pollFirst();
                    }
                    if(node != null){
                        list.add(node.val);
                        node = node.right;
                        
                    }
                }
            }

        }
        return list;
    }
}