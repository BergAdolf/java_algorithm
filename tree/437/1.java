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
//时间复杂度： O(n)
//空间复杂度: O(n2)
class Solution {
	int Number = 0;
    public int pathSum(TreeNode root, int sum) {
        List<Integer> list = new ArrayList<>();
        searchNumberSum(root, list, sum);
        return Number;
    }

    public void searchNumberSum(TreeNode node, List<Integer> list, int sum){
    	if(node == null)
    		return;
    	if(node.val == sum)
    		Number++;

    	if(!list.isEmpty())
    	{
    		int temp = list.get(list.size() - 1);
    		int i = list.size() - 1;
    		while(i >= 0){
    			if(node.val + temp == sum){
    				Number++;
    			}
    			i--;
                if(i >= 0)
    			    temp = temp + list.get(i);
    		}
    	}
    	list.add(node.val);
    	searchNumberSum(node.left, list, sum);
    	searchNumberSum(node.right, list, sum);
    	list.remove(list.size() - 1);
    }
}