package linkedlist;

import org.junit.Test;

public class TestSolution114 {
    @Test
    public void testSolution114() {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next.next = head.next;
        Solution114 solution114 = new Solution114();
        System.out.println(solution114.hasCycle1(head));
    }
}
