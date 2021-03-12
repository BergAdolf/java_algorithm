public class Solution {
	//哈希表
	//如果遍历过一次设置为true;
	//时间复杂度：O(n)
	//空间复杂度：O(n)
    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}

