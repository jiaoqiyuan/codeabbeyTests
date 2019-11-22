package codeabby;

import java.util.Scanner;

public class BitCount_81 {
    public static void main(String[] args) {
        BitCount_81 s = new BitCount_81();
        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();

        while(input.hasNext()) {
            int tmp = input.nextInt();
            int c = 0;
            for (c = 0; tmp != 0; ++c) {
                tmp &= (tmp - 1);
            }
            System.out.println(c + " ");
        }
    }
}
