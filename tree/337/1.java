cclass Solution {
    public int rob(TreeNode root) {
        int[] list = maxValue(root);

        return Math.max(list[0], list[1]);
    }

    public int[] maxValue(TreeNode node){
    	if(node == null)
    		return new int[2];//0表示选择，1表示不选择

    	int[] list1 = maxValue(node.left);
    	int[] list2 = maxValue(node.right);

    	int selected = list1[1] + list2[1] + node.val;
    	int notSelected = Math.max(list1[1], list1[0]) + Math.max(list2[0], list2[1]);

    	return new int[]{selected, notSelected};

    }
}