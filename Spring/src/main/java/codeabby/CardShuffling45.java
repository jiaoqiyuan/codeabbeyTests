package codeabby;

import java.util.ArrayList;
import java.util.Scanner;

public class CardShuffling45 {
    //创建固定列表存放花色和纸牌数值
    private static final ArrayList<String> ranks = new ArrayList<String>(){{add("A"); add("2"); add("3"); add("4"); add("5");
        add("6"); add("7"); add("8"); add("9"); add("T"); add("J"); add("Q"); add("K");}};
    private static final ArrayList<String> suits = new ArrayList<String>(){{add("C"); add("D"); add("H"); add("S");}};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = input.nextLine().split(" ");
        String[] output = new String[52];
        //初始化output，按顺序将纸牌放入列表中
        for (int i = 0; i < output.length; i++) {
            int rank_index = i % 13;
            int suit_index = i / 13;
            String card_name = suits.get(suit_index) + ranks.get(rank_index);
            output[i] = card_name;
        }
        //根据指定数字洗牌
        for (int i = 0; i < words.length; i++) {
            int index = Integer.parseInt(words[i]) % 52;
            //交换两个数
            String tmp = output[index];
            output[index] = output[i];
            output[i] = tmp;
        }
        for (String card :
                output) {
            System.out.print(card + " ");
        }
    }
}
