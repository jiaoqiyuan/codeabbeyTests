package tests.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmaptest1 {

    public static void getMapKeyValues() {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "jack");
        hashMap.put(2, "bill");
        String result = hashMap.put(1, "rose");
        System.out.println("result:" + result);
        Iterator<Integer> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println("key: " + key + " value: " + hashMap.get(key));
        }

        Iterator<Map.Entry<Integer, String>> iterator1 = hashMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> next = iterator1.next();
            System.out.println("key: " + next.getKey() + " value: " + next.getValue());
        }
    }

    public static void testTraversal() {
        HashMap<Integer, String> map = new HashMap(16);
        map.put(7, "");
        map.put(11, "");
        map.put(43, "");
        map.put(59, "");
        map.put(19, "");
        map.put(3, "");
        map.put(35, "");

        System.out.println("遍历结果：");
        for (Integer key : map.keySet()) {
            System.out.print(key + " -> ");
        }
    }

    public static void main(String[] args) {
        getMapKeyValues();
        //testTraversal();
    }
}
