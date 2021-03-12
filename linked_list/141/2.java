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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;

        ListNode node1 = head.next;
        ListNode node2 = head;
        while(node1 != node2){
            if(node1.next == null || node1.next.next == null)
                return false;
            node1 = node1.next.next;
            node2 = node2.next;
        }     
        return true;
    }
}