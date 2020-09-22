public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{1, 2, 3, 4};
//        int[] nums = new int[]{1, 1, 1, 1, 1};
        int[] nums = new int[]{3, 1, 2, 10, 1};
        solution.runningSum(nums);
    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            int[] result = new int[nums.length];

            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum += nums[i];
                result[i] = sum;
            }

            return result;
        }
    }
}
