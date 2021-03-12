/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//1和3相同 
//都是查找长度，然后让长的减去一些，然后对比
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int lenA = 1;
        int lenB = 1;
        int len;
        ListNode head1 = headA;
        ListNode head2 = headB;

        while(headA.next != null) {
            headA = headA.next;
            lenA++;
        }
        while(headB.next != null){
            headB = headB.next;
            lenB++;
        }
        headA = head1;//fuan
        headB = head2;//chang

        if(lenA > lenB){
            head1 = headB; //代表较短的链表
            head2 = headA; //代表较长的链表
            len = lenA - lenB;
        }
       else{
           len = lenB - lenA;
       }
        while(len != 0){
                head2 = head2.next;
                len--;
        }
        while(head1 != null){
            if(head1 == head2){
                return head1;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;


    }
}