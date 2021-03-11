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
//  时间复杂度：O(logk * l * k)，k是列表个数，l是长度
//  空间复杂度：O(logk)
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length < 1){
            return null;
        }
        ListNode hand = merge(lists, 0, lists.length - 1);

        return hand;
    }

    public ListNode merge(ListNode[] list, int left, int right){
        if(left == right)
            return list[left];
        if(left > right)
            return null;
        int mid = (left + right)>>>1;

        ListNode leftList = merge(list, left, mid);
        ListNode rightList = merge(list, mid + 1, right);
        return mergeList(leftList, rightList);
    }    

    public ListNode mergeList(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode hand = new ListNode(0);
        ListNode pointer = hand;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                pointer.next = l2;
                l2 = l2.next;
                pointer = pointer.next;  
            }
            else{
                pointer.next = l1;
                l1 = l1.next;
                pointer = pointer.next;
            }
        }
        if(l1 == null){
            pointer.next = l2;
        }else{
            pointer.next = l1;
        }
        return hand.next;
    }
}