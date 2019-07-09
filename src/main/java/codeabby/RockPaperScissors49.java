package codeabby;

import java.util.Scanner;

public class RockPaperScissors49 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String lineNumber = input.nextLine();

        while(input.hasNextLine()) {
            String line = input.nextLine();
            int count1 = 0;
            int count2 = 0;

            String lineSplits[] = line.split(" ");
            for (int i = 0; i < lineSplits.length; i++) {
                String value = lineSplits[i];
                if (value.equals("RR")  || value.equals("PP")|| value.equals("SS")) {
                    continue;
                } else if (value.equals("RP") || value.equals("SR") || value.equals("PS")) {
                    count2 ++;
                } else if (value.equals("PR") || value.equals("SP") || lineSplits[i].equals("RS")) {
                    count1 ++;
                }
            }
            if(count1 > count2) {
                System.out.println("1 ");
            } else {
                System.out.println("2 ");
            }
        }
    }
}
