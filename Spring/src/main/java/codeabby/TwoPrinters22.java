package codeabby;

import java.util.Scanner;

public class TwoPrinters22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.nextLine();
        while (input.hasNextLine()) {
            String words[] = input.nextLine().split(" ");
            int x_printer = Integer.parseInt(words[0]);     //X值
            int y_printer = Integer.parseInt(words[1]);     //Y值
            int pages = Integer.parseInt(words[2]);         //打印页数
            int time = 0;                                   //打印总时间
            //穷举法，将x打印页数从0到pages的情况全部列出来，找出时间最短的那种情况
            for (int i = 0; i < pages; i++) {
                int tmp_time = 0;
                //如果x打印机最终花费了较长的时间，就以x打印机的时间为准
                if (i * x_printer >= (pages - i) * y_printer) {
                    tmp_time = i * x_printer;
                //如果y打印机花费了较长时间，就以y打印机的时间为准
                } else {
                    tmp_time = (pages - i) * y_printer;
                }
                //如果是第一次循环（time=0）或者当前情况下时间比之前记录的最小时间短，就更新最短时间.
                if (time == 0 || tmp_time < time) {
                    time = tmp_time;
                }
            }
            System.out.println(time + " ");

        }
    }
}
