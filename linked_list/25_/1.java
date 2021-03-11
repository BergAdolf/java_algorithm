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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1 || head == null || head.next == null){
            return head;
        }
        ListNode node = head;
        ListNode node2 = head;
        ListNode node3 = head;
        ListNode node4 = head;
        Boolean flag = false;

        while(true){
            for(int i = 0; i < k - 1; i++){
                if(node2.next == null && flag)
                {//如果node中间没有了？
                    node4.next = head;
                    return node;
                }
                if(!flag && node2.next == null){
                    return head;
                }
                node2 = node2.next;
            }
            flag  = true;   //标志第一次循环完成
            for(int i = 0; i < k - 2; i++){
                head = head.next.next;
                node3 = node3.next; 
                node3.next = node;
                node = node3;
                node3 = head;
            }
            head = head.next;
            head.next = node3;
            node3.next = node;

            node = head;
            node2 = node2.next;
            head  = node2;
            node3 = head;
        }

        return new ListNode(0);
    }

}