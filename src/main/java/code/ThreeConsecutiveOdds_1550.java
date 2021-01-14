package code;

public class ThreeConsecutiveOdds_1550 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{2, 6, 4, 1};
//        int[] arr = new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12};
        int[] arr = new int[]{1, 2, 1, 1};
        System.out.println(solution.threeConsecutiveOdds(arr));
    }

    static class Solution {
        public boolean threeConsecutiveOdds(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0)
                    count++;
                else if (arr[i] % 2 == 0)
                    count = 0;
                if (count == 3)
                    return true;
            }
            return false;
        }
    }
}

