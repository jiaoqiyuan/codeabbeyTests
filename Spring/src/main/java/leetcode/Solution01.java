package leetcode;

public class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int number1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int number2 = nums[j];
                if (number1 + number2 == target) {
                    int res[] = {i, j};
                    return res;
                }
            }
        }
        System.out.println("no result");
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        Solution01 solution01 = new Solution01();
        int[] res = solution01.twoSum(numbers, 9);
        if (res == null) {
            return;
        }
        for (int num : res) {
            System.out.println(num);
        }

    }
}
