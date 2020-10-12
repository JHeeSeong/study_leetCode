import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryExcludingTheMinimimumSalary_1491 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{4000, 3000, 1000, 2000};
//        int[] arr = new int[]{1000, 2000, 3000};
//        int[] arr = new int[]{6000, 5000, 4000, 3000, 2000, 1000};
        int[] arr = new int[]{8000, 9000, 2000, 3000, 6000, 1000};
        System.out.println(solution.average(arr));
    }

    static class Solution {
        public double average(int[] salary) {
            List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());
            Collections.sort(list);

            list.remove(0);
            list.remove(list.size() - 1);

            double sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }

            return sum / list.size();
        }
    }
}
