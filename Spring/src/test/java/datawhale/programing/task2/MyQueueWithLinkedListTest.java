package datawhale.programing.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueWithLinkedListTest {
    @Test
    public void testMyQueueWithLinkedList() {
        MyQueueWithLinkedList myStackWithLinkedList = new MyQueueWithLinkedList();
        myStackWithLinkedList.enterQueue("hello");
        myStackWithLinkedList.enterQueue("nice");
        myStackWithLinkedList.enterQueue("to");
        myStackWithLinkedList.enterQueue("meet");
        myStackWithLinkedList.enterQueue("you");
        myStackWithLinkedList.printQueue();
        System.out.println("======出队=======");
        System.out.println(myStackWithLinkedList.outQueue());
        System.out.println("========结果=====");
        myStackWithLinkedList.printQueue();
        System.out.println("=====入队=====");
        myStackWithLinkedList.enterQueue("enter");
        myStackWithLinkedList.printQueue();
        System.out.println("=====出队========");
        System.out.println(myStackWithLinkedList.outQueue());
        System.out.println("==================");
        myStackWithLinkedList.printQueue();
    }

}