package jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOutOfMemory {



    /**

     * @param args

     * @Author YHJ create at 2011-11-12 下午07:52:18

     */

    public static void main(String[] args) {
        List<TestCase> cases = new ArrayList<TestCase>();
        while(true){

            cases.add(new TestCase());
        }
    }

}

/**

 * @Described：测试用例

 * @author YHJ create at 2011-11-12 下午07:55:50

 * @FileNmae com.yhj.jvm.memory.heap.HeapOutOfMemory.java

 */

class TestCase{

}