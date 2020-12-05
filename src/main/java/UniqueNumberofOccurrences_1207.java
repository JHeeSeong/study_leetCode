import java.util.ArrayList;
import java.util.HashMap;

public class UniqueNumberofOccurrences_1207 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] arr = new int[]{1, 2, 2, 1, 1, 3};
//        int[] arr = new int[]{1, 2};
        int[] arr = new int[]{-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        System.out.println(solution.uniqueOccurrences(arr));
    }

    static class Solution {
        public boolean uniqueOccurrences(int[] arr) {
            ArrayList<Integer> values = new ArrayList<>();
            HashMap<Integer, Integer> sameMap = new HashMap<>();

            for (int value : arr) {
                sameMap.put(value, sameMap.getOrDefault(value, 0) + 1);
            }

            for (Integer key : sameMap.keySet()) {
                values.add(sameMap.get(key));
            }

            for (int i = 0; i < values.size(); i++) {
                int temp = values.get(i);
                for (int j = i + 1; j < values.size(); j++) {
                    if (temp == values.get(j))
                        return false;
                }
            }

            return true;
        }
    }
}

