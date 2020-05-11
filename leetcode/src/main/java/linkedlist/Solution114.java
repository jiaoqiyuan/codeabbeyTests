package linkedlist;

import java.util.*;

public class Solution114 {
    public boolean hasCycle(ListNode head) {
        head.hashCode();
        Set<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (nodes.contains(head)) {
                return true;
            } else {
                nodes.add(head);
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        ListNode quickNode = head;
        ListNode slowNode = head;
        while (quickNode != null && slowNode != null) {
            if (quickNode.next == null || quickNode.next.next == null) {
                return false;
            }
            quickNode = quickNode.next.next;
            slowNode = slowNode.next;
            if (quickNode == slowNode) {
                return true;
            }
        }
        return false;
    }
}
