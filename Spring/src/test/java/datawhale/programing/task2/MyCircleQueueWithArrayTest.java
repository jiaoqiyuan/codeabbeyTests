package datawhale.programing.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyCircleQueueWithArrayTest {
    @Test
    public void testMyCircleQueueWithArray() {
        MyCircleQueueWithArray myCircleQueueWithArrayTest = new MyCircleQueueWithArray(5);
        myCircleQueueWithArrayTest.enterQueue(10);
        myCircleQueueWithArrayTest.enterQueue(11);
        myCircleQueueWithArrayTest.enterQueue(12);
        myCircleQueueWithArrayTest.enterQueue(13);
        myCircleQueueWithArrayTest.enterQueue(14);
        myCircleQueueWithArrayTest.printQueue();
        myCircleQueueWithArrayTest.outQueue();
        System.out.println("========");
        myCircleQueueWithArrayTest.printQueue();
        myCircleQueueWithArrayTest.enterQueue(15);
        System.out.println("========");
        myCircleQueueWithArrayTest.printQueue();
    }

}