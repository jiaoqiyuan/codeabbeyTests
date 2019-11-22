package codeabby;

import java.util.Scanner;

public class QuadraticEquation38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String[] words = input.nextLine().split(" ");
            int a = Integer.parseInt(words[0]);
            int b = Integer.parseInt(words[1]);
            int c = Integer.parseInt(words[2]);

            if ((b * b - 4 * a * c) < 0) {
                int tmp = (b * b - 4 * a * c) * -1;
                System.out.print(-b/(2*a) + "+" + (int)Math.sqrt(tmp)/(2*a) + "i " + -b/(2*a) + "-" + (int)Math.sqrt(tmp)/(2*a) + "i");
                if (input.hasNextLine()) {
                    System.out.print("; ");
                }

            } else {
                double tmp = Math.sqrt((double) (b * b - 4 * a * c));
                int x1 = (int)(-b + tmp) / (2*a);
                int x2 = (int)(-b - tmp) / (2*a);
                System.out.print(x1 + " " + x2);
                if (input.hasNextLine()) {
                    System.out.print("; ");
                }
            }
        }
    }
}
