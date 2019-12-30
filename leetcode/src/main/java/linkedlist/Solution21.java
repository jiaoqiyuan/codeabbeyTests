package linkedlist;

public class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result =  new ListNode(0);
        ListNode current = result;
        if (l1 == null && l2 == null) {
            result.next = null;
        } else if (l1 == null || l2 == null) {
            result.next = l1 == null ? l2 : l1;
        }

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                if (l1.next == null) {
                    l1.next = l2;
                    break;
                } else {
                    current = l1;
                }
                l1 = l1.next;
            } else {
                current.next = l2;
                if (l2.next == null) {
                    l2.next = l1;
                    break;
                } else {
                    current = l2;
                }
                l2 = l2.next;
            }
        }
        return result.next;
    }
}
