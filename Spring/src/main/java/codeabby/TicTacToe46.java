package codeabby;

import java.util.*;

public class TicTacToe46 {
    static List<List<String>> allres;
    public static void format_wins() {
        List<String> w1 = Arrays.asList("1", "2", "3");
        List<String> w2 = Arrays.asList("4", "5", "6");
        List<String> w3 = Arrays.asList("7", "8", "9");
        List<String> w4 = Arrays.asList("1", "4", "7");
        List<String> w5 = Arrays.asList("2", "5", "8");
        List<String> w6 = Arrays.asList("3", "6", "9");
        List<String> w7 = Arrays.asList("1", "5", "9");
        List<String> w8 = Arrays.asList("3", "5", "7");
        allres = Arrays.asList(w1, w2, w3, w4, w5, w6, w7, w8);
    }

    public static boolean check(List<String> player) {

        for (List<String> wins : allres) {
            if (player.containsAll(wins)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        format_wins();
        while (input.hasNextLine()) {
            String inputs[] = input.nextLine().split(" ");
            List<String> playerA = new ArrayList<String>();
            List<String> playerB = new ArrayList<String>();
            boolean flag = false;
            for (int i = 0; i < inputs.length; i++) {
                if (i % 2 == 0) {
                    playerA.add(inputs[i]);
                } else {
                    playerB.add(inputs[i]);
                }
                if (i < 4) {
                    continue;
                } else {
                    if (check(playerA) || check(playerB)) {
                        System.out.print(i + 1 + " ");
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) {
                System.out.println("0 ");
            }
        }
    }
}
