public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        ListNode a = len1 > len2 ? move(headA, len1-len2) : headA;
        ListNode b = len2 > len1 ? move(headB, len2-len1) : headB;

        while (a!=null && b!=null) {
            if(a==b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }

    private int getLength(ListNode head) {
        int len = 0;
        while(head != null) {
            len++;
            head = head.next;
        }
        return len;
    }

    // stepCount>=1
    private ListNode move(ListNode head, int stepCount) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
            if(count>=stepCount) {
                break;
            }
        }
        return head;
    }
}