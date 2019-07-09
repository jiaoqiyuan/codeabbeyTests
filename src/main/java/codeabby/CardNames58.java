package codeabby;

import java.util.ArrayList;
import java.util.Scanner;

public class CardNames58 {
    static final ArrayList<String> suits = new ArrayList<String>(){{add("Clubs"); add("Spades"); add("Diamonds"); add("Hearts");}};
    static final ArrayList<String> ranks = new ArrayList<String>(){{add("2"); add("3"); add("4"); add("5");
        add("6"); add("7"); add("8"); add("9"); add("10"); add("Jack"); add("Queen"); add("King"); add("Ace");}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        input.nextLine();
        String line[] = input.nextLine().split(" ");
        for (String word: line) {
            int number = Integer.parseInt(word);
            int suit_value = number / 13;
            int rank_value = number % 13;
            System.out.print(ranks.get(rank_value) + "-of-" + suits.get(suit_value) + " ");
        }
    }
}
