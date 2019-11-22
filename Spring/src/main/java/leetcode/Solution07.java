package leetcode;

public class Solution07 {

    public int reverse(int x) {
        long y = 0;
        int yu = x % 10;
        int chu = x / 10;
        while(yu != 0 || chu != 0) {
            y = y * 10 + yu;
            yu = chu % 10;
            chu = chu / 10;
        }
        if(y > 2147483647 || y < -2147483648)
            return 0;
        return (int)y;
    }

    public static void main(String[] args) {
        Solution07 solution07 = new Solution07();
        System.out.println(solution07.reverse(1534236466));
    }
}
