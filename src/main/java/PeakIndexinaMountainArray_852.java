import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PeakIndexinaMountainArray_852 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{0, 1, 0};
//        int[] arr = new int[]{0, 2, 1, 0};
//        int[] arr = new int[]{0, 10, 5, 2};
//        int[] arr = new int[]{3, 4, 5, 1};
        int[] arr = new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19};
        System.out.println(solution.peakIndexInMountainArray(arr));
    }

    static class Solution {
        public int peakIndexInMountainArray(int[] arr) {
            List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
            int maxNum = Collections.max(list);

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == maxNum) {
                    return i;
                }
            }
            return 0;
        }
    }
}