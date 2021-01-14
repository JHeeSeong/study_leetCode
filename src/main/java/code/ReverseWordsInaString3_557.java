package code;

public class ReverseWordsInaString3_557 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords("Let's take LeetCode contest"));
    }

    static class Solution {
        public String reverseWords(String s) {
            String[] arr = s.split(" ");
            String result = "";

            for (int i = 0; i < arr.length; i++) {
                for (int j = arr[i].length() - 1; j >= 0; j--) {
                    result += arr[i].charAt(j);
                }
                if (i != arr.length - 1)
                    result += " ";
            }
            return result;
        }
    }
}
