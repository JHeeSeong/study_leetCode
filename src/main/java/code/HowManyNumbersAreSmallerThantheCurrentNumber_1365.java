package code;

public class HowManyNumbersAreSmallerThantheCurrentNumber_1365 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{8, 1, 2, 2, 3};
//        int[] arr = new int[]{6,5,4,8};
        int[] arr = new int[]{7,7,7,7};

        System.out.println(solution.smallerNumbersThanCurrent(arr));
    }

    static class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] result = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                int num = nums[i];
                int count = 0;
                for (int j = 0; j < nums.length; j++) {
                    if (num > nums[j])
                        count++;
                }
                result[i] = count;
            }

            return result;
        }
    }
}
