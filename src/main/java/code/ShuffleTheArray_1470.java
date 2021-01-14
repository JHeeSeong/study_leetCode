package code;

public class ShuffleTheArray_1470 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{2, 5, 1, 3, 4, 7};
        int[] nums = new int[]{1, 2, 3, 4, 4, 3, 2, 1};
//        int[] nums = new int[]{1, 1, 1, 1, 1};

        solution.shuffle(nums, 4);
    }

    static class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] xNums = new int[n];
            int[] yNums = new int[n];

            for (int i = 0; i < n; i++) {
                xNums[i] = nums[i];
            }
            for (int i = 0; i < n; i++) {
                yNums[i] = nums[i + n];
            }

            int[] resultNums = new int[nums.length];
            int j = 0;
            for (int i = 0; i < n; i++) {
                resultNums[j] = xNums[i];
                resultNums[j + 1] = yNums[i];

                j += 2;
            }

            return resultNums;
        }
    }
}
