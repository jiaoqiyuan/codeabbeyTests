package codeabby;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TriangleArea104 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();

        while(input.hasNextLine()) {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            int x3 = input.nextInt();
            int y3 = input.nextInt();


            double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
            double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
            double c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
//
//            System.out.println("a = " + a);
//            System.out.println("b = " + b);
//            System.out.println("c = " + c);
            double s = (a + b + c) / 2;
//            System.out.println(s + " ");

            double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            DecimalFormat df = new DecimalFormat("0.0");
            System.out.println(df.format(result) + " ");
        }
    }
}

