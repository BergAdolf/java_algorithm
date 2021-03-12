
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//龟兔赛跑问题
//时间复杂度：O(n)
//空间复杂度：O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null|| head.next == null) return null;
        ListNode node1 = head;
        ListNode node2 = head;

        while(true){
        	if(node1.next == null || node1.next.next == null){
        		return null;
        	}
        	node1 = node1.next.next;
        	node2 = node2.next;
        	if(node2 == node1){
        		break;
        	}
        }
        node1 = head;
        while(node2 != node1){
        	node1 = node1.next;
        	node2 = node2.next;
        }

        return node2;
    }
}
