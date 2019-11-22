package datawhale.programing.task2;

public class MyQueueWithLinkedList {
    public class Node {
        private String data;
        private Node next;
        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    public void enterQueue(String value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public String outQueue() {
        String result;
        if (head == null) {
            throw new IllegalArgumentException("Queue is empty.");
        } else if (head.next == null) {
            result = head.data;
            head = null;
        } else {
            Node tmp = head;
            while (tmp.next.next != null) {
                tmp = tmp.next;
            }
            result = tmp.next.data;
            tmp.next = null;
        }
        return result;
    }

    public void printQueue() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}
