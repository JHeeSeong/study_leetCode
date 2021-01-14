package code;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MaximunProductOfTwoElementsInAnArray_1464 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{3, 4, 5, 2};
//        int[] arr = new int[]{1, 5, 4, 5};
        int[] arr = new int[]{3, 7};
        System.out.println(solution.maxProduct(arr));
    }

    static class Solution {
        public int maxProduct(int[] nums) {
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
            Collections.sort(list);

            int one = list.get(list.size() - 1);
            int two = list.get(list.size() - 2);

            return (one - 1) * (two - 1);
        }
    }
}

