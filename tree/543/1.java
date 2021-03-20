class Solution {
    int maxValue = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        lengthOfTree(root);
        return maxValue;
    }

    public int lengthOfTree(TreeNode root){
        if(root == null)
            return 0;

        int length1 = lengthOfTree(root.left);
        int length2 = lengthOfTree(root.right);
        
        maxValue = Math.max(length1 + length2, maxValue);

        return Math.max(length1, length2) + 1;
    }
}