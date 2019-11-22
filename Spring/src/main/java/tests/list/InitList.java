package tests.list;

import java.util.Arrays;
import java.util.List;

public class InitList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 3, 9);
        List<int[]> numbers1 = Arrays.asList(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});

        numbers.add(3);
    }
}
