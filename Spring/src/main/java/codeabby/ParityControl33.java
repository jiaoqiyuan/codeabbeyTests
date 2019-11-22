package codeabby;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParityControl33 {

    private static int getbits(int number) {
        int tmp = number;
        int n = 0;
        while (tmp != 0) {
            if ((tmp & 1) == 1) {
                n++;
            }
            tmp = tmp >> 1;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        List<String> list = new ArrayList<>();
        for (String word :
                words) {
            int result = getbits(Integer.parseInt(word));
            if (Integer.parseInt(word) > 128) {
                if (result % 2 == 0) {
                    int tmp = Integer.parseInt(word) - 128;
                    list.add(String.valueOf(tmp));
                }
            } else {
                if (result % 2 == 0) {
                    list.add(word);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String num :
                list) {
            sb.append((char) Integer.parseInt(num));
        }
        System.out.println(sb.toString());
    }

}
