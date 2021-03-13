/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//迭代法

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
      	ListNode pre = null;
      	ListNode curr = head;
      	while(head.next != null){
      		head = head.next;
      		curr.next = pre;
      		pre = curr;
      		curr = head;
      	}
      	curr.next = pre;
      	return curr;
    }
}
