package linklist;

import linklist.publicUtils.ListNode;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月18日 23:27
 */
public class Q876MiddleoftheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode l = head;
        ListNode r = head;
        while(null != r && null != r.next){
            l = l.next;
            r = r.next.next;
        }
        return l;
    }
}
