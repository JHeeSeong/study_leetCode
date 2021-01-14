package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{1, 2, 3, 4};
//        int[] arr = new int[]{1, 1, 1, 1, 1};
        int[] arr = new int[]{3, 1, 2, 10, 1};
        System.out.println(solution.runningSum(arr));
    }

    static class Solution {
        public int[] runningSum(int[] nums) {
            List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
            List<Integer> result = new ArrayList<>();

            result.add(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                int sum = list.get(i) + result.get(i - 1);
                result.add(sum);
            }
            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
