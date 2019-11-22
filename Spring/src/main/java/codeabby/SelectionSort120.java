package codeabby;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectionSort120 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        String[] numbers = input.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(Integer.parseInt(numbers[i]));
        }
        int index = 0;
        while (list.size() != 1) {
            int max = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) > max) {
                    max = list.get(i);
                    index = i;
                }
            }
            list.set(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            System.out.println(index + "   " + max);
        }
    }
}
