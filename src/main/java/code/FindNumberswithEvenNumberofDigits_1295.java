package code;

import java.util.ArrayList;

public class FindNumberswithEvenNumberofDigits_1295 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{12, 345, 2, 6, 7896};
        int[] arr = new int[]{555,901,482,1771};

        System.out.println(solution.findNumbers(arr));
    }

    static class Solution {
        public int findNumbers(int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                int length = (nums[i] + "").length();
                if (length % 2 == 0)
                    count++;
            }

            return count;
        }
    }
}
