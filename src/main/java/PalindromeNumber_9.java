public class PalindromeNumber_9 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.isPalindrome(0);
    }

    static class Solution {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }

            char[] arr = (x + "").toCharArray();

            for (int i = 0; i < arr.length / 2; i++) {
                if (arr[i] != arr[arr.length - i - 1]) {
                    return false;
                }
            }

            return true;
        }
    }
}
