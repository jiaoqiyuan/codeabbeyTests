package codeabby;

import java.util.*;

public class MatchingWords55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        String line_split[] = line.split(" ");
        List<String> list = new ArrayList<>();
        for(String word : line_split){
            String tmp[] = line.split(word);
            //只添加重复出现两次以上的单词
            if (tmp.length - 1 > 1) {
                if (list.indexOf(word) == -1)
                list.add(word);
            }
        }
        //对列表进行排序
        Collections.sort(list);
        //method1: not ok in jdk7
//        System.out.println(String.join(" ", list));

        //method2: ok
        for (String word : list) {
            System.out.print(word + " ");
        }
        //method3: ok
//        StringBuilder sb = new StringBuilder();
//        for (String word: list) {
//            sb.append(word + " ");
//        }
//        System.out.println(sb.toString());
    }
}
