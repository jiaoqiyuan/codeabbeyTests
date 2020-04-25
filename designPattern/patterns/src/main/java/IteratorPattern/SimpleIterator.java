package IteratorPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("user1");
        list.add("user2");
        list.add("user3");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().compareTo("user2") == 0) {
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
    }
}
