import java.util.ArrayList;
import java.util.List;

public class StringMatchingInAnArray_1408 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        String[] arr = new String[]{"mass", "as", "hero", "superhero"};
//        String[] arr = new String[]{"leetcode","et","code"};
//        String[] arr = new String[]{"blue","green","bu"};
        String[] arr = new String[]{"leetcoder", "leetcode", "od", "hamlet", "am"};
        System.out.println(solution.stringMatching(arr));
    }

    static class Solution {
        public List<String> stringMatching(String[] words) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < words.length; i++) {
                String diff = words[i];
                for (int j = i + 1; j < words.length; j++) {
                    if (diff.contains(words[j])) {
                        result.add(words[j]);
                    } else if (words[j].contains(diff)) {
                        result.add(diff);
                    }
                }
            }

            ArrayList<String> arrayList = new ArrayList<>();

            for (String item : result) {
                if (!arrayList.contains(item))
                    arrayList.add(item);
            }

            return arrayList;
        }
    }
}

