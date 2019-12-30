package linkedlist;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */

public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = new ListNode(0);
        if (head == null || head.next == null) {
            return head;
        }
        /*
        ListNode current = head;
        result.next = current;
        head = head.next;
        while (head != null) {
            if (head.val == current.val) {
                if (head.next == null) {
                    current.next = null;
                    break;
                } else {
                    current.next = head.next;
                    head = head.next;
                }
            } else {
                current = head;
                if (head.next == null) {
                    current.next = null;
                    break;
                } else {
                    head = head.next;
                }
            }
        }
        return result.next;
         */
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) head = head.next;
        return head;
    }
}
