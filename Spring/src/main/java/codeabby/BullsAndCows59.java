package codeabby;

import java.util.Scanner;

public class BullsAndCows59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String standardNumber = input.next();
        input.nextLine();
        String line = input.nextLine();
        for (String word : line.split(" ")) {
            int correctPosition = 0;
            int wrongPosition = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == standardNumber.charAt(i)) {
                    correctPosition += 1;
                } else if (standardNumber.indexOf(word.charAt(i)) != -1) {
                    wrongPosition += 1;
                }
            }
            System.out.println(correctPosition + "-" + wrongPosition + " ");
        }
    }
}
