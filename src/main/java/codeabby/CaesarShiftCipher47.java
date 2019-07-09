package codeabby;

import java.util.Scanner;

public class CaesarShiftCipher47 {

    public static void main(String[] args) {

        String tmp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Scanner input = new Scanner(System.in);
        int numberOfLines = input.nextInt();
        int count = input.nextInt();

        while(input.hasNext()) {
            String line = input.nextLine();
            StringBuilder sb = new StringBuilder(line);
            for (int i = 0; i < line.length(); i++) {
                if(line.charAt(i) == ' ' || line.charAt(i) == '.') {
                    continue;
                }
                int index = tmp.indexOf(line.charAt(i));
                sb.setCharAt(i, tmp.charAt((index + 26 * (count/26+1) - count) % 26));
            }
            System.out.println(sb.toString() + " ");
        }
    }

}

