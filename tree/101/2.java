//使用队列
//Queue<TreeNode> list2 = new LinkedList<>();
//poll 和offer指令
//
package berg;
import java.util.*;

class test {
    public boolean isSymmetric(TreeNode root) {

        if(root == null ||(root.left == null && root.right == null))
            return true;
        TreeNode node1;
        TreeNode node2;
        Queue<TreeNode> list1 = new LinkedList<>();
        Queue<TreeNode> list2 = new LinkedList<>();
        if(root.left != null)
            list1.offer(root.left);
        if(root.right != null)
            list2.offer(root.right);

        while(!list1.isEmpty() && !list2.isEmpty()){
            node1 = list1.poll();
            node2 = list2.poll();

            if(node1 == null && node2 == null)
                continue;
            if(node1 == null || node2 == null)
                return false;
            if(node1.val != node2.val)
                return false;
            list1.offer(node1.left);
            list1.offer(node1.right);
            list2.offer(node2.right);
            list2.offer(node2.left);

        }
        if(list1.isEmpty() && list2.isEmpty())
            return true;
        return false;
    }
}