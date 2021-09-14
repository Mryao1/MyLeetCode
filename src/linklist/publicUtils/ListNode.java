package linklist.publicUtils;

import lombok.Data;

/**
 * @author zyzhao
 * @description
 * @date 2021年08月18日 23:28
 */
@Data
public class ListNode {
    private int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
