package codeabby;

import java.util.Scanner;

public class FoolsDay94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            int sum = 0;
            for (String word : line.split(" ")) {
                sum += Integer.parseInt(word) * Integer.parseInt(word);
            }
            System.out.println(sum + " ");
        }
    }
}
