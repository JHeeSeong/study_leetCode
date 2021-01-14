package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NRepeatedElementinSize2NArray_961 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 2, 3, 3};
        System.out.println(solution.repeatedNTimes(arr));
    }

    static class Solution {
        public int repeatedNTimes(int[] A) {
            List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
            int result = 0;
            int value = 0;
            HashMap<Integer, Integer> hashMap = new HashMap();
            for (int i = 0; i < list.size(); i++) {
                hashMap.put(A[i], 0);
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.contains(A[i])) {
                    int temp = hashMap.get(A[i]);
                    hashMap.put(A[i], temp += 1);
                }
            }

            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (result < entry.getValue()) {
                    result = entry.getValue();
                    value = entry.getKey();
                }
            }

            return value;
        }
    }
}

