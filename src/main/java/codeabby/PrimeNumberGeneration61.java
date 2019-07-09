package codeabby;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberGeneration61 {

    private static List<Integer> primeList(int n) {
        boolean prime[] = new boolean[n + 1];
        //先将数组全部填为true
        Arrays.fill(prime, true);
        //精华所在，将范围n之内的数字判断之后标记，如果是素数就为true，如果是非素数就为false
        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i + i; j < n; j = i + j) {
                    prime[j] = false;
                }
            }
        }
        //将所有n以内的素数添加到列表中然后返回这个列表
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        input.nextLine();
        String line = input.nextLine();
        List<Integer> list = primeList(10000000);
        for (String word : line.split(" ")) {
            int number = Integer.parseInt(word);
            System.out.print(list.get(number - 1) + " ");
        }

    }
}
