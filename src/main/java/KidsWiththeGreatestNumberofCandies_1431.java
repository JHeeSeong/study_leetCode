import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KidsWiththeGreatestNumberofCandies_1431 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{2, 3, 5, 1, 3};
//        System.out.println(solution.kidsWithCandies(arr, 3));
//        int[] arr = new int[]{4,2,1,1,2};
//        System.out.println(solution.kidsWithCandies(arr, 1));
        int[] arr = new int[]{12, 1, 12};
        System.out.println(solution.kidsWithCandies(arr, 10));
    }

    static class Solution {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Integer> inputList = Arrays.stream(candies).boxed().collect(Collectors.toList());
            int maxNum = Collections.max(inputList);

            List<Boolean> result = new ArrayList<>();
            for (int num : inputList) {
                if ((num + extraCandies) >= maxNum)
                    result.add(true);
                else result.add(false);
            }

            return result;
        }
    }
}
