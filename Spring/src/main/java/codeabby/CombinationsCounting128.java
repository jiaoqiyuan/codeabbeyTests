package codeabby;

import java.math.BigInteger;
import java.util.*;

public class CombinationsCounting128 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String[] words = input.nextLine().split(" ");
            int N = Integer.parseInt(words[0]);
            int K = Integer.parseInt(words[1]);
            BigInteger njiecheng = new BigInteger("1");
            BigInteger kjiecheng = new BigInteger("1");
            BigInteger n_kjiecheng = new BigInteger("1");
            for (int i = 1; i <= N; i++) {
                njiecheng = njiecheng.multiply(new BigInteger(String.valueOf(i)));
            }

            for (int i = 1; i <= K; i++) {
                kjiecheng = kjiecheng.multiply(new BigInteger(String.valueOf(i)));
            }

            for (int i = 1; i <= (N - K); i++) {
                n_kjiecheng = n_kjiecheng.multiply(new BigInteger((String.valueOf(i))));
            }

            System.out.println(njiecheng.divide(kjiecheng.multiply(n_kjiecheng)) + " ");

        }
    }
}
