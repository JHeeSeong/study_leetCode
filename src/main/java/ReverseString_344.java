public class ReverseString_344 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] chars = new char[]{'h','e','l','l','o'};
        solution.reverseString(chars);
    }

    static class Solution {
        public void reverseString(char[] s) {
            char[] newChars = new char[s.length];

            int j = 0;
            for (int i = s.length-1; i >=0 ; i--) {
                newChars[j] = s[i];
                j++;
            }

            for (int i = 0; i < newChars.length; i++) {
                s[i] = newChars[i];
            }
        }
    }
}
