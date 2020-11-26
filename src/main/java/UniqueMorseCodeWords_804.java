import java.util.HashSet;

public class UniqueMorseCodeWords_804 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strings = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(solution.uniqueMorseRepresentations(strings));
    }

    static class Solution {
        public int uniqueMorseRepresentations(String[] words) {
            String[] alpha = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
            HashSet<String> results = new HashSet<>();

            for (int i = 0; i < words.length; i++) {
                String mos = "";
                for (int j = 0; j < words[i].length(); j++) {
                    int chars = words[i].charAt(j);
                    mos += alpha[chars - 97];
                }
                results.add(mos);
            }
            return results.size();
        }
    }
}
