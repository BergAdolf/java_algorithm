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
//时间复杂度 O(n)
//空间复杂度 O(n)
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode pointer = new ListNode(0, head);

        return exchangeNode(pointer, head);
     }
        public ListNode exchangeNode(ListNode pointer1, ListNode pointer2){
            if(pointer2 == null || pointer2.next == null)
                return pointer2;

            pointer1.next = pointer2.next;
            pointer1 = pointer1.next;
            pointer2.next = exchangeNode(pointer1, pointer1.next);
            pointer1.next = pointer2;
            return pointer1;
        }
}