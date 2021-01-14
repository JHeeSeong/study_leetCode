package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HeightChecker_1051 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{1, 1, 4, 2, 1, 3};
//        int[] nums = new int[]{5, 1, 2, 3, 4};
        int[] nums = new int[]{1, 2, 3, 4, 5};
        System.out.println(solution.heightChecker(nums));
    }

    static class Solution {
        public int heightChecker(int[] heights) {
            List<Integer> temp = Arrays.stream(heights).boxed().collect(Collectors.toList());
            Collections.sort(temp);

            int result = 0;
            for (int i = 0; i < heights.length; i++) {
                if (temp.get(i) != heights[i])
                    result++;
            }

            return result;
        }
    }
}
