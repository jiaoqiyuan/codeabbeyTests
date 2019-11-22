package datawhale.programing.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueWithArrayTest {

    @Test
    public void TestMyQueueWithArray() {
        MyQueueWithArray myQueueWithArray = new MyQueueWithArray(16);
        myQueueWithArray.enterQueue("hello");
        myQueueWithArray.enterQueue("world");
        myQueueWithArray.enterQueue("nice");
        myQueueWithArray.enterQueue("to");
        myQueueWithArray.enterQueue("meet");
        myQueueWithArray.enterQueue("you");
        myQueueWithArray.printQueue();
        System.out.println("========");
        String result = myQueueWithArray.outQueue();
        System.out.println(result);
        System.out.println("=========");
        myQueueWithArray.printQueue();
        System.out.println("=========");
        System.out.println(myQueueWithArray.outQueue());
        System.out.println("========");
        myQueueWithArray.printQueue();
    }

}