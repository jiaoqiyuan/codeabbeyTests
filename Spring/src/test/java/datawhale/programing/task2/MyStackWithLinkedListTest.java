package datawhale.programing.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackWithLinkedListTest {
    @Test
    public void testLinkedListStack() {
        MyStackWithLinkedList myStackWithLinkedList = new MyStackWithLinkedList();
        myStackWithLinkedList.push(10);
        myStackWithLinkedList.push(11);
        myStackWithLinkedList.push(12);
        myStackWithLinkedList.push(13);
        myStackWithLinkedList.push(14);
        myStackWithLinkedList.push(15);
        myStackWithLinkedList.printStack();
        System.out.println("==============");
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println(myStackWithLinkedList.pop());
        System.out.println("==============");
        myStackWithLinkedList.printStack();
    }
}