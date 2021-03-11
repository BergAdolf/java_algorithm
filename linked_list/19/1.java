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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node1 = new ListNode(0, head); //构造一个指向head的指针
        ListNode node2 = new ListNode(0, head);
        for(int i = 0; i < n - 1; i++){
            node1 = node1.next;
        }
        if(node1.next.next == null){
            if(head.next == null){
                return null;
            }
            else{
                head = head.next;
                return head;
            }
        }
        node1 = node1.next;

        while(node1.next != null){
            node1 = node1.next;
            node2 = node2.next;
        }
        node2.next = node2.next.next;
        return head;
    }
}