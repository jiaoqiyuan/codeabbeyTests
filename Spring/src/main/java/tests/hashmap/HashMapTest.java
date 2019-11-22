package tests.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "Jony");
        hashMap.put(2, "Bill");
        //System.out.println(hashMap.get(1));
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        Iterator<Integer> iterator1 = hashMap.keySet().iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            System.out.println("key: " + key.toString() + " value: " + hashMap.get(key));
        }
    }
}