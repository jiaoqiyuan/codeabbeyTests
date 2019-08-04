package datawhale.programing;


public class MyArray {
    private int[] data;   //数组
    private int size;   //数组元素个数

    /**
     * 带参数的构造函数
     * @param capacity
     */
    public MyArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 默认构造函数
     */
    public MyArray() {
        this(16);
    }

    private void expand(int length) {
        //重新申请数组
        int[] newdata = new int[length];
        //拷贝原有数组内容到新申请的数组
        for (int i = 0; i < data.length; i++) {
            newdata[i] = data[i];
        }
        //将data引用切换到新的数组
        data = newdata;
    }

    /**
     * 往数组增加数据
     * @param value
     */
    public void insert(int value) {
        //判断数组是否需要扩容
        if (size == data.length) {
            //扩容数组，数组容量翻倍
            expand(data.length >> 1);
        }

        data[size] = value;
        size++;

    }

    /**
     * 删除指定索引的数据
     * @param index
     */
    public void delete(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("The index is out of range.");
        }
        //将index之后的所有元素向前移动一位
        for (int i = index; i < size; i++) {
            //如果数组是满的，最后一位置为null
            if (i == data.length - 1) {
                data[i] = Integer.parseInt(null);
            } else {
                data[i] = data[i + 1];
            }
        }
        size--;
    }

    /**
     * 更新指定索引位置的元素值
     * @param index
     * @param value
     */
    public void update(int index, int value) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException("Index out of range.");
        }

        data[index] = value;
    }

    public MyArray merge(MyArray array1) {
        MyArray array = new MyArray(array1.size + this.size);
        System.out.println("array length: " + array.data.length);
        int index = 0;
        int a1index = 0;
        int a2index = 0;
        while (a1index < array1.size && a2index < this.size) {
            if (array1.data[a1index] < this.data[a2index]) {
                array.insert(array1.data[a1index++]);
            } else {
                array.insert(this.data[a2index++]);
            }
        }

        //如果array1数组还有剩余数据
        if (a1index < array1.size) {
            for (int i = a1index; i < array1.size; i++) {
                array.insert(array1.data[i]);
            }
        } else if (a2index < this.size) {
            //如果array2有剩余数据
            for (int i = a2index; i < this.size; i++) {
                array.insert(this.data[i]);
            }
        }

        return array;
    }

    /**
     * 打印数组
     */
    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i] + ", ");
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray(10);
        //增加元素
        myArray.insert(6);
        myArray.insert(4);
        myArray.insert(7);
        myArray.printArray();
        System.out.println("===================");
        //删除元素
        myArray.delete(1);
        myArray.printArray();
        System.out.println("===================");
        //更新元素
        myArray.update(0, 10);
        myArray.printArray();
        System.out.println("===================");

        //创建两个有序数组
        MyArray myArray1 = new MyArray(10);
        MyArray myArray2 = new MyArray(10);
        myArray1.insert(3);
        myArray1.insert(5);
        myArray1.insert(6);
        myArray1.insert(9);
        myArray1.insert(10);
        myArray1.insert(15);
        myArray2.insert(4);
        myArray2.insert(8);
        myArray2.insert(10);
        myArray2.insert(16);
        myArray2.insert(19);
        myArray2.insert(20);

        //合并两个数组
        MyArray myArray3 = myArray1.merge(myArray2);
        myArray3.printArray();

    }
}
