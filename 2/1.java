/此种方法会导致多出一个listNode结点
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode l = first;
        int c = 0;
        int x,y;
        while(l1 != null || l2 != null){
            x = (l1 == null)? 0 : l1.val;
            y = (l2 == null)? 0 : l2.val;
            l.val = (x + y + c) % 10;
            l.next = new ListNode(0);  
            l = l.next;
            c = (x + y + c) / 10;
            if(l1 != null)
                l1.next = l1;
            if(l2 != null)
                l2.next = l2;
        }
        if(c == 1)
            l.next =  new ListNode(c);
        return first;
    }
}
