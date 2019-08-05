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
     * 单链表反转
     */
    public void reverse() {
        //如果列表为空或者只有一个元素，直接返回
        if (head == null || head.next == null) {
            return;
        }

        //使用preNode和nextNode记录前驱和后继节点，用于反转
        Node preNode = null;
        Node nextNode = null;
        while (head != null) {
            nextNode = head.next;
            head.next = preNode;
            preNode = head;
            head = nextNode;
        }
        head = preNode;
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
        mySingleLinkedList.insert(11);
        mySingleLinkedList.insert(12);
        mySingleLinkedList.insert(13);
        mySingleLinkedList.insert(14);
        mySingleLinkedList.printList();
        System.out.println("+=========");
        mySingleLinkedList.delete(10);
        mySingleLinkedList.printList();
        System.out.println("+=========");
        mySingleLinkedList.reverse();
        mySingleLinkedList.printList();

    }
}
