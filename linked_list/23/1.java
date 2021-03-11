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
//	采用PirorityQueue的方法，需import java.util.PriorityQueue, 从O(k * K * l)
//	时间复杂度：O(logk * l * k)，k是列表个数，l是长度
//	空间复杂度：O(k)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> (o1.val - o2.val));
        ListNode head = new ListNode(0);
        ListNode pointer = head;

        for(ListNode node:lists){
            if(node != null)
        	    queue.add(node);
        }

        while(!queue.isEmpty()){
        	head.next = queue.poll();
        	head = head.next;

        	if(head.next != null)
        		queue.add(head.next);
        }
        return pointer.next;
    }
}