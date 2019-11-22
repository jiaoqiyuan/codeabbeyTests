package codeabby;

import java.util.Scanner;

public class IntegerFactorization63 {
    static boolean flag = false;

    public static void getFactorization(long num) {
        if (num == 1) {
            return;
        }

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (!flag)
                    System.out.print(i);
                else
                    System.out.print("*" + i);
                flag = true;
                getFactorization(num / i);
                break;
            }

        }
    }

    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        inputs.nextLine();
        while (inputs.hasNextLine()) {
            flag = false;
            long number = inputs.nextLong();
            getFactorization(number);
            System.out.print(" ");
        }

    }
}
