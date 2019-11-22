package codeabby;

import java.util.Scanner;

public class BlackjackCounting42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String[] words = input.nextLine().split(" ");
            int sum = 0;
            int countA = 0;
            for (String word:
                 words) {
                if (word.compareTo("2") == 0 || word.compareTo("3") == 0 || word.compareTo("4") == 0
                        || word.compareTo("5") == 0 || word.compareTo("6") == 0
                        || word.compareTo("7") == 0 || word.compareTo("8") == 0
                        || word.compareTo("9") == 0) {
                    sum += Integer.parseInt(word);
                } else if (word.compareTo("T") == 0 || word.compareTo("J") == 0
                || word.compareTo("Q") == 0 || word.compareTo("K") == 0) {
                    sum += 10;
                } else if (word.compareTo("A") == 0) {
                   countA ++;
                }
            }
            if (sum > 21) {
                System.out.println("Bust ");
            } else {

                int n = 0;
                for (int i = 1; i <= countA; i++) {
                    if (sum + i*11 <= 21) {
                        n ++;
                    } else {
                        break;
                    }
                }
                sum += n * 11 + (countA - n) * 1;
                System.out.println(sum);
                if (sum > 21) {
                    System.out.println("Bust ");
                } else {
                    System.out.println(sum + " ");
                }

            }

        }
    }
}
