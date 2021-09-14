package linklist;

import linklist.publicUtils.ListNode;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class Q876MiddleoftheLinkedListTest {

    public static final Q876MiddleoftheLinkedList q = new Q876MiddleoftheLinkedList();

    @Test
    public void test1(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode exp = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertEquals(3, q.middleNode(head).getVal());
    }

    @Test
    public void test2(){
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode exp = new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))));
        assertEquals(4, q.middleNode(head).getVal());
    }

}