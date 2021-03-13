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
//递归法
class Solution {
    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	ListNode head1 = head.next;
    	head.next = null;
    	return reverseListFunction(head, head1);
    }
   	public ListNode reverseListFunction(ListNode head1, ListNode head2){
   		
   		ListNode head3 = head2.next;
   		if(head3 == null){
   			head2.next = head1;
   			return head2;
   		}

        head2.next = head1;
   		return reverseListFunction(head2, head3);
   		
   	}
}