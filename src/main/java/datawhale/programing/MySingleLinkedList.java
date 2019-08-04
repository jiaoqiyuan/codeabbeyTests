package datawhale.programing;

public class MySingleLinkedList {
    public static class Node {
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        public int getData() {
            return this.data;
        }
    }

    Node head = null;

    /**
     * 往链表中插入元素
     * @param value
     */
    public void insert(int value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
            node.next = null;
        }
    }

    public void delete(int value) {
        if (head != null && head.data == value) {
            head = head.next;
        }

        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.data == value) {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }

    }

    /**
     * 打印链表元素
     */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        MySingleLinkedList mySingleLinkedList = new MySingleLinkedList();
        mySingleLinkedList.insert(10);
        mySingleLinkedList.insert(19);
        mySingleLinkedList.insert(19);
        mySingleLinkedList.insert(19);
        mySingleLinkedList.printList();
        System.out.println("+=========");
        mySingleLinkedList.delete(10);
        mySingleLinkedList.printList();
    }
}
