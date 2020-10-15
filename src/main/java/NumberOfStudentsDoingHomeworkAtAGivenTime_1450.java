import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfStudentsDoingHomeworkAtAGivenTime_1450 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] startTime = new int[]{1, 2, 3};
//        int[] endTime = new int[]{3, 2, 7};
//        System.out.println(solution.busyStudent(startTime, endTime, 4));

//        int[] startTime = new int[]{4};
//        int[] endTime = new int[]{4};
//        System.out.println(solution.busyStudent(startTime, endTime, 4));

//        int[] startTime = new int[]{4};
//        int[] endTime = new int[]{4};
//        System.out.println(solution.busyStudent(startTime, endTime, 5));

//        int[] startTime = new int[]{1,1,1,1};
//        int[] endTime = new int[]{1,3,2,4};
//        System.out.println(solution.busyStudent(startTime, endTime, 7));

        int[] startTime = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] endTime = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(solution.busyStudent(startTime, endTime, 5));
    }

    static class Solution {
        public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
            List<Integer> startTimes = Arrays.stream(startTime).boxed().collect(Collectors.toList());
            List<Integer> endTimes = Arrays.stream(endTime).boxed().collect(Collectors.toList());

            int count = 0;
            for (int i = 0; i < startTimes.size(); i++) {
                int result = endTimes.get(i) - startTimes.get(i);
                if (queryTime <= result || (endTimes.get(i) == startTimes.get(i) && startTimes.get(i) == queryTime))
                    count++;

            }

            return count;
        }
    }
}

