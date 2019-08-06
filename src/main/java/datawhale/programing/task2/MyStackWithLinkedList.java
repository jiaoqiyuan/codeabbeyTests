package datawhale.programing.task2;

public class MyStackWithLinkedList {
    public class Node {
        private int data;
        private Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    Node head = null;

    /**
     * 入栈，插入的元素放在链表头部，方便pop
     * @param value
     */
    public void push(int value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            //直接放在head前面
            node.next = head;
            head = node;
        }
    }

    public int pop() {
        int result;
        if (head == null) {
            throw new IllegalArgumentException("Stack is empty, can not pop anymore!");
        } else if (head.next == null) {
            result = head.data;
            head = null;
        } else {
            result = head.data;
            head = head.next;
        }
        return result;
    }

    public void printStack() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
