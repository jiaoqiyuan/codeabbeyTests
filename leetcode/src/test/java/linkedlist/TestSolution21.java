package linkedlist;

import org.junit.Test;

public class TestSolution21 {
    @Test
    public void testSolution21() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        Solution21 solution21 = new Solution21();
        ListNode result = solution21.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
}
