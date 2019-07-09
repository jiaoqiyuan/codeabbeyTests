package codeabby;

import java.util.Scanner;

public class BinarySearch34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String[] numbers = input.nextLine().split(" ");
            double a = Float.parseFloat(numbers[0]);
            double b = Float.parseFloat(numbers[1]);
            double c = Float.parseFloat(numbers[2]);
            double d = Float.parseFloat(numbers[3]);

            double start = 0;
            double end  = 100;
            double x = 100;
            double result = 0;

            while (true) {
                result = (a * x + b * Math.sqrt(x*x*x) - c * Math.exp(-x / 50) - d);

                if (result > 0.00000001) {
                    end = x;
                    x = (start + end) / 2;
                } else if (result < -0.00000001) {
                    start = x;
                    x = (start + end) / 2;
                } else {
                    System.out.println(x + " ");
                    break;
                }
            }
        }
    }
}
