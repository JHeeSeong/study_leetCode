package code;

public class CheckIfAWorkOccursAsAPrefixOfAnyWorkInASentence_1455 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.isPrefixOfWord("i love eating burger", "burg"));
//        System.out.println(solution.isPrefixOfWord("this problem is an easy problem", "pro"));
//        System.out.println(solution.isPrefixOfWord("i am tired", "you"));
//        System.out.println(solution.isPrefixOfWord( "i use triple pillow", "pill"));
//        System.out.println(solution.isPrefixOfWord("hello from the other side", "they"));

        System.out.println(solution.isPrefixOfWord("hellohello hellohellohello", "ell"));
    }

    static class Solution {
        public int isPrefixOfWord(String sentence, String searchWord) {
            int result = -1;
            String[] sentences = sentence.split(" ");
            for (int i = 0; i < sentences.length; i++) {
                if (sentences[i].startsWith(searchWord) ) {
                    return i + 1;
                }
            }

            return result;
        }
    }
}
