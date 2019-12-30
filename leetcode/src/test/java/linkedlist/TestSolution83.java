package linkedlist;

import org.junit.Test;

public class TestSolution83 {
    @Test
    public void testSolution83 () {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        Solution83 solution83 = new Solution83();
        ListNode result = solution83.deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
