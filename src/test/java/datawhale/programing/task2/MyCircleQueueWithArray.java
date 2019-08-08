package datawhale.programing.task2;

public class MyCircleQueueWithArray {
    private int[] data;
    private int head;
    private int tail;

    public MyCircleQueueWithArray(int capacity) {
        this.data = new int[capacity + 1];
        this.head = 0;
        this.tail = 0;
    }

    public void enterQueue(int value) {
        //判断队列是否已满
        int index = (tail + 1) % data.length;
        if (index == head) {
            throw new IllegalArgumentException("circle queue is full now.");
        }
        data[tail] = value;
        tail = index;
    }

    public int outQueue() {
        if (head == tail) {
            throw new IllegalArgumentException("circle queue is empty.");
        }

        int result = data[head];
        data[head] = 0;
        head++;
        if (head > data.length - 1) {
            head %= data.length;
        }

        return result;
    }

    public void printQueue() {
        if (tail > head) {
            for (int i = head; i < tail; i++) {
                System.out.println(data[i]);
            }
        } else if (tail < head) {
            for (int i = head; i < head + data.length - 1; i++) {
                if (i > (data.length - 1)) {
                    System.out.println(data[i % data.length]);
                } else {
                    System.out.println(data[i]);
                }
            }
        }
    }
}
