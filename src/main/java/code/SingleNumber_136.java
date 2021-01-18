package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class SingleNumber_136 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{2, 2, 1};
        int[] arr = new int[]{4, 1, 2, 1, 2};
//        int[] arr = new int[]{1};
//        int[] arr = new int[]{1, 0, 1};
//        int[] arr = new int[]{4, 1, 2, 1, 2};
//        int[] arr = new int[]{1, 3, 1, -1, 3};

        System.out.println(solution.singleNumber(arr));
    }

    static class Solution {
        public int singleNumber(int[] nums) {
            List<Integer> removeDuplicationList = new ArrayList<>();

            for (int num : nums) {
                if (!removeDuplicationList.contains(num)) {
                    removeDuplicationList.add(num);
                } else {
                    removeDuplicationList.remove(num);
                }
            }
            return removeDuplicationList.get(0);
        }
    }
}
