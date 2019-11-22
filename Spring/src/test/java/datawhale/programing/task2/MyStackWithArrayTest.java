package datawhale.programing.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackWithArrayTest {

    @Test
    public void testMyStackWithArray() {
        MyStackWithArray myStackWithArray = new MyStackWithArray(16);
        myStackWithArray.push(10);
        myStackWithArray.push(11);
        myStackWithArray.push(12);
        myStackWithArray.push(13);
        myStackWithArray.printStack();
        System.out.println("=======");
        System.out.println(myStackWithArray.pop());
        myStackWithArray.printStack();
    }
}