class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode l = first;
        int c = 0;
        int x,y,sum;
        while(l1 != null || l2 != null){
            x = (l1 == null)? 0 : l1.val;
            y = (l2 == null)? 0 : l2.val;
            sum = x + y + c;

            l.next = new ListNode(sum % 10);
            l = l.next;

            c = sum / 10;
            if(l1 != null)
                l1 = l1.next;   指针别颠倒
            if(l2 != null)
                l2 = l2.next;
        }
        if(c == 1)
            l.next =  new ListNode(c);
    
        return first.next;  去除第一个结点
    }
}
