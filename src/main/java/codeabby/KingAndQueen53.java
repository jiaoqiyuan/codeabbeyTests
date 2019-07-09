package codeabby;

import java.util.Scanner;

/**
 * 考察java获取char，绝对值的获取等知识。
 */
public class KingAndQueen53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String[] words = input.nextLine().split(" ");
            char x1 = words[0].charAt(0);
            int y1 = Character.getNumericValue(words[0].charAt(1));
            char x2 = words[1].charAt(0);
            int y2 = Character.getNumericValue(words[1].charAt(1));
            if ((Math.abs(x1 - x2) == Math.abs(y1 - y2)) || x1 == x2 || y1 == y2) {
                System.out.println("Y ");
            } else {
                System.out.println("N ");
            }

        }
    }
}
