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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length;
        int inLen = inorder.length;

        if(preLen == 0)
        	return null;

        Map<Integer, Integer> map = new HashMap<>(inLen);
        for(int i = 0; i < inLen; i++){
        	map.put(inorder[i], i);
        }

        return getTree(preorder, 0, preLen - 1, inorder, 0, inLen - 1, map);
    }

    public TreeNode getTree(int[] preorder,int pre1,int pre2, int[] inorder,int in1,int in2, Map<Integer, Integer>map){
    	if(pre1 > pre2 || in1 > in2){
    		return null;
    	}
    	
    	int index = map.get(preorder[pre1]);
    	TreeNode node = new TreeNode(preorder[pre1]);
    	node.left = getTree(preorder, pre1 + 1, index + pre1 - in1, inorder, in1, index - 1, map);
    	node.right = getTree(preorder, index + pre1 - in1 + 1, pre2, inorder, index + 1, in2, map);

    	return node;
    }

}