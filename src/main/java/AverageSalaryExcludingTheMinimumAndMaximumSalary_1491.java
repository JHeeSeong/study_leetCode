import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary_1491 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{4000, 3000, 1000, 2000};
        System.out.println(solution.average(arr));
    }

    static class Solution {
        public double average(int[] salary) {
            Arrays.sort(salary);
            List<Integer> list = Arrays.stream(salary).boxed().collect(Collectors.toList());

            list.remove(0);
            list.remove(list.size()-1);

            int count = list.size();
            double totalSal = 0.0;
            for (int sal : list)
                totalSal += sal;

            return totalSal / count;
        }
    }
}
