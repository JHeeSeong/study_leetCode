import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAnArray_912 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{5,2,3,1};
        System.out.println(solution.sortArray(nums));
    }

    static class Solution {
        public int[] sortArray(int[] nums) {
            Arrays.sort(nums);

            return nums;
        }
    }
}
