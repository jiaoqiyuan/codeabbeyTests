package datawhale.programing.task2;

public class MyStackWithArray {
    private int[] array;    //存放数据的数组
    private int size;       //栈内元素个数
    private int capacity;   //栈大小

    public MyStackWithArray(int n) {
        array = new int[n];
        this.size = 0;
        this.capacity = n;
    }

    /**
     * 入栈
     * @param value
     * @return
     */
    public boolean push(int value) {
        //如果栈满，就返回失败
        if (size == capacity) {
            return false;
        }

        array[size++] = value;
        return true;
    }

    /**
     * 出栈操作
     * @return
     */
    public int pop() {
        if (size == 0) {
            throw new IllegalArgumentException("Stack is empty, can not pop anymore!");
        }
        int result = array[size - 1];
        size--;
        return result;
    }

    public void printStack() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }
}
