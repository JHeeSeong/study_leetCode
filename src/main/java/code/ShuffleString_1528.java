package code;

import java.util.Arrays;
import java.util.HashMap;

public class ShuffleString_1528 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
//        int[] nums = new int[]{0,1,2};
        int[] nums = new int[]{4, 0, 2, 6, 7, 3, 1, 5};

//        System.out.println(solution.restoreString("codeleet", nums));
//        System.out.println(solution.restoreString("abc", nums));
        System.out.println(solution.restoreString("aaiougrt", nums));
    }

    static class Solution {
        public String restoreString(String s, int[] indices) {
            HashMap<Integer, Character> list = new HashMap<>();
            char[] chars = s.toCharArray();

            String result = "";

            for (int i = 0; i < indices.length; i++) {
                list.put(indices[i], chars[i]);
            }
            Object[] mapkey = list.keySet().toArray();
            Arrays.sort(mapkey);

            for (Integer nKey : list.keySet()) {
                result += list.get(nKey);
            }
            return result;
        }
    }
}
