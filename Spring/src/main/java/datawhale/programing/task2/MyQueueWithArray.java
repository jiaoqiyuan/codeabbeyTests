package datawhale.programing.task2;

public class MyQueueWithArray {
    private String[] array; //存放队列元素
    private int size;       //存放队列元素个数
    private int capacity;   //存放队列大小

    public MyQueueWithArray(int n) {
        this.array = new String[n];
        this.size = 0;
        this.capacity = n;
    }

    public void enterQueue(String value) {
        if (size == capacity) {
            //队列已满
            throw new IllegalArgumentException("Queue is already full.");
        }

        array[size++] = value;
    }

    public String outQueue() {
        if (size == 0) {
            //队列没有元素
            throw new IllegalArgumentException("Queue is empty.");
        }

        String value = array[0];
        for (int i = 0; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
        return value;
    }

    public void printQueue() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
